package com.myapp;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@RequestMapping(value = "/user1", method = RequestMethod.GET)
	public ModelAndView showUserForm1() {
		UserInfo uf=new UserInfo();
		return new ModelAndView("addUser1", "command",uf);
	}
	 @RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
		public ModelAndView addUser1(
				@ModelAttribute("userData") UserInfo uObj,BindingResult result) {
		      //request data is available in the UserInfo obj
			 //springs performs req capturing and springs keeps the req data inside UserInfo obj
			return new ModelAndView("showUserInput", "userObj",uObj);
		}
	  
//----------------------------------------------------------------------------------------------------
	 
	 @RequestMapping(value = "/user2", method = RequestMethod.GET)
		public ModelAndView showUserForm21() {
			return new ModelAndView("user2", "userData",new UserInfo());
		}
	 
	 @RequestMapping(value = "/addUser2", method = RequestMethod.POST)
		public ModelAndView addUser2(
				@ModelAttribute("userData") UserInfo userInfoObj, //userInfoObj contains the input data submitted by customer
				BindingResult result) {
			int age = userInfoObj.getAge();
			int teleSize =userInfoObj.getTelephone().length();
	    if(age<=18 || age>=60){
				String errorMsg ="Age should be between 18 and 60.";
				ModelAndView mObj  = new ModelAndView("user2");
				mObj.addObject("errorMsg", errorMsg);
				mObj.addObject("userData", userInfoObj);
				return mObj;
			}else if (teleSize!=10){
				String errorMsg ="telephone should be exactly 10 digits";
				ModelAndView mObj  = new ModelAndView("user2");
				mObj.addObject("errorMsg", errorMsg);
				mObj.addObject("userData", userInfoObj);
				return mObj;
			}else if (!userInfoObj.getEmail().contains("@") && !userInfoObj.getEmail().contains(".")){
				String errorMsg ="Invalid email syntax.";
				ModelAndView mObj  = new ModelAndView("user2");
				mObj.addObject("errorMsg", errorMsg);
				mObj.addObject("userData", userInfoObj);
				return mObj;
			}
	    return new ModelAndView("showUserInput", "userObj",userInfoObj);
	    
	    
	    }


//----------------------------------------------------------------------------------------------------------------------------------------
	 
	 
//---------------------------------------------------------------------------------------------------------------------------------------
	 
	 
	 @Autowired
		UserService service;
	  
	  
	 @RequestMapping(value = "/user21", method = RequestMethod.GET)
		public ModelAndView showUser21() {
			return new ModelAndView("user21", "userData",new UserInfo());
		}
	  
	  
	  @RequestMapping(value = "/addUser21", method = RequestMethod.POST)
		public ModelAndView addUser21(
				@ModelAttribute("userData") UserInfo userInfoObj,
				BindingResult result) {
			List<String> errors = service.validateUserInfo(userInfoObj);
			if(!errors.isEmpty()) {
				ModelAndView mObj  = new ModelAndView("user21");
				mObj.addObject("errors", errors);
				return mObj;
			}else {
				return new ModelAndView("showUserInput", "userObj",userInfoObj);
			}
		}
	 
//------------------------------------------------------------------------------------------------
	  //click on link 
	  @RequestMapping(value = "/user3", method = RequestMethod.GET)
		public ModelAndView showUserForm3() {
			return new ModelAndView("user3", "userData",new UserInfo());
		}
	  
	  
	  //click on button
	  @RequestMapping(value = "/addUser3", method = RequestMethod.POST)
		public ModelAndView addUserWithValidation(
				@ModelAttribute("userData") UserInfo userInfoObj,BindingResult result) throws EmployeeException {
				service.processValidation(userInfoObj);
				return new ModelAndView("showUserInput", "userObj",userInfoObj);	
		}
	  
	  //exception handling logic for EmployeeException instead of try catch write below method
	  @ExceptionHandler(EmployeeException.class)
		public ModelAndView handleEmployeeException(HttpServletRequest request, Exception ex){
			ModelAndView modelAndView = new ModelAndView("errorpage");
		    modelAndView.addObject("message", "error occured due to :"+ex.getMessage());
		    return modelAndView;
		}
		
	  
	  
//------------------------------------------------------------------------------------------------
	//click on link on home.jsp
	  @RequestMapping(value = "/validatelogin")
	  	public ModelAndView viewLogin() {
	  		return new ModelAndView("LoginForm", "userForm", new User());
	  	}


	  //click on button on LoginForm.jsp
	  	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	  	public String doLogin(
	  			@Valid 
	  			@ModelAttribute("userForm") User userform,
	  			BindingResult result) {
	  		if (result.hasErrors()) {
	  			return "LoginForm";
	  		}
	  		return "LoginSuccess";
	  	}
	  	
	    
	    
	  
}
