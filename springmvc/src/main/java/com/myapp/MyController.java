package com.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
//1-------------------------------------------------------------------------------------------------------------------------------------	
	@RequestMapping("/getSessionData")
	public ModelAndView getSessionData(HttpSession session) { // get session obj
	String userName = (String) session.getAttribute("myName"); // get the data inside the session
	if (userName == null || userName.isEmpty()) {
	userName = "[ NO DATA IN SESSION... ]";
	}
	return new ModelAndView("hellopage", "userName", userName);
	}

	
//2-----------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping("/deleteSessionData")
	public ModelAndView deleteSessionData(HttpSession session) {
	session.removeAttribute("myName");// delete the data from session
	return new ModelAndView("hellopage", "userName", "NO DATA IN SESSION");
	}
	
	
//3------------------------------------------------------------------------------------------------------------------------------------	
	
	@RequestMapping(value = "/postSessionData", method = RequestMethod.POST)
	public ModelAndView postSessionData(@RequestParam("uName") String userName, HttpSession session) {// get session obj
	session.setAttribute("myName", userName);// myName is the session name
	return new ModelAndView("hellopage", "userName", userName);
	}
	
	
	
//4------------------------------------------------------------------------------------------------------------------------------------------	
	
	 @RequestMapping(value = "/registerform1", method = RequestMethod.GET)	
	 public ModelAndView showRegister1() {
		 return new ModelAndView("register1");
	 }
   
   
   
   @RequestMapping(value = "/registerform1", method = RequestMethod.POST)
	public ModelAndView registerValidation1(@RequestParam("ID") String id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("age") int age,
			@RequestParam("password") String password) {
        //keep the request data inside the obj
		RegisterForm registerObj = new RegisterForm();
		registerObj.setAge(age);
		registerObj.setId(id);
		registerObj.setFirstName(firstName);
		registerObj.setLastName(lastName);
		registerObj.setPassword(password);

   List<String> list = new ArrayList<String>();

		if (!(registerObj.getId().startsWith("C_") || registerObj.getId().startsWith("P_"))) {
			list.add("id should start with C_ or P_");

		}
		if ((registerObj.getFirstName().length() < 10)) {
			list.add("fistname should contain min 10 characters");

		}
		if ((registerObj.getLastName().length() < 8)) {
			list.add("fistname should contain min 8 characters");
		}

		if (registerObj.getPassword().length() < 10 || registerObj.getPassword().contains(" ")
				|| registerObj.getPassword().length() > 15) {
			list.add("password should be min 10, max 15 characters and space not allowed");
		}
		if (registerObj.getAge() < 18 || registerObj.getAge() > 60) {
			list.add("age should be min 18, max 60");
		}
    
    
if (list.isEmpty()) {
			//no errror found
			ModelAndView response = new ModelAndView("successRegister");
			response.addObject("msg", "registration success");
			return response;
		} 
        else {
			//send error mss + obj to the response page
			ModelAndView response = new ModelAndView("register1");
			response.addObject("form1", registerObj);
			response.addObject("msgs", list);
			return response;
		}
    



}
   
   
//5---------------------------------------------------------------------------------------------------------------------------------------
   
	
	@RequestMapping(value = "/registerform", method = RequestMethod.GET)	
	 public ModelAndView showRegister() {
		 return new ModelAndView("register");
	 }
  
  @RequestMapping(value = "/registerform", method = RequestMethod.POST)
	public ModelAndView registerValidation(@RequestParam("ID") String id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("age") int age,
			@RequestParam("password") String password) {
     
      //keep request data inside the object
		RegisterForm registerObj = new RegisterForm();
		registerObj.setAge(age);
		registerObj.setId(id);
		registerObj.setFirstName(firstName);
		registerObj.setLastName(lastName);
		registerObj.setPassword(password);


      //if id is invalid then return  message and object
     if (!(id.startsWith("C_") || id.startsWith("P_"))) {
			ModelAndView response = new ModelAndView("register");
			response.addObject("msg", "id should start with C_ or P_");
			response.addObject("form", registerObj);
			return response;
		}
   
   
   //if firstName is invalid then return  message and object
		if ((firstName.length() < 10)) {
			ModelAndView response = new ModelAndView("register");
			response.addObject("msg", "firstName should be min 10 characters");
			response.addObject("form", registerObj);

			return response;
		}
   
   
     //if lastName is invalid then return  message and object
		if ((lastName.length() < 8)) {
			ModelAndView response = new ModelAndView("register");
			response.addObject("msg", "lastName should be min 8 characters");
			response.addObject("form", registerObj);

			return response;
		}
   
   
 //if password is invalid then return message and object
		if (password.length() < 10 || password.contains(" ") || password.length() > 15) {
			ModelAndView response = new ModelAndView("register");
			response.addObject("msg", "password should be min 10, max 15 characters and space not allowed");
			response.addObject("form", registerObj);

			return response;
		}
 
   //if age is invalid then return  message and object
		if (age < 18 || age > 60) {
			ModelAndView response = new ModelAndView("register");
			response.addObject("msg", "age should be min 18, max 60");
			response.addObject("form", registerObj);

			return response;
		}
   
    //if all input data is valid then return the success msg to the success page
		return new ModelAndView("successRegister","msg", "registration success");

   
     
     
     }
     
     
	
//6-------------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping("/getEmp/{id}/{name}")
	public ModelAndView getEmployeeByPathId(
	@PathVariable("id") int userId,
	@PathVariable("name") String name)throws Exception {
	String myData = "userId = "+userId +"name="+name;
	return new ModelAndView("readDetails", "myData", myData);
	}
	
	
	
//7------------------------------------------------------------------------------------------------------------------------------------------	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(
	@RequestParam("userName") String userName,
	@RequestParam("password") String password) {
	String res = "";
	if (userName.equals("admin") && password.equals("admin123")) {
	res = "Login is Succes";
	} else {
	res = "Login Failure due to invalid creds";
	}
	return new ModelAndView("respose5","message", res);
	}
	
	
//8---------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	@PostMapping(value = "/register")
	public ModelAndView registerPost(
	@RequestParam("uName") String userName,
	@RequestParam("age") int age,
	@RequestParam("sal") float sal) {
	String resData = "Hi " + userName + " , age = " + age + ", sal =" + sal;
	return new ModelAndView("readDetails", "myData", resData);
	}
	
	
//9---------------------------------------------------------------------------------------------------------------------------------------	
	
	
	@GetMapping(value = "/register")
	public ModelAndView registerGet(
			@RequestParam("uName") String userName,
			@RequestParam("age") int age, 
			@RequestParam("sal") float sal) {
	
  String resData = "Request Data : name= " + userName + " , age = " + age + ", sal =" + sal;
	
  return new ModelAndView("readDetails", "myData", resData);   
  
  //readDetails.jsp is the response page and resData is the response data to the jsp
	
  }
  
  
//10-----------------------------------------------------------------------------------------------------------------------------------------	
  
  
  @RequestMapping(value="/hello1" , method= RequestMethod.GET )
	public String handleHello1(){
		return "welcome1";
	} //here welcome1.jsp is the response page
  
  
  
  
  
  
  
 //11---------------------------------------------------------------------------------------------------------------------------------------- 

  
@RequestMapping(value="/hello2" , method= RequestMethod.GET )
	public ModelAndView showPage1(){
		return new ModelAndView("welcome2");//here welcome2.jsp is the response page
	}


//---------------------------------------------------------------------------------------------------------------------


@RequestMapping(value = "/helloWithData", method = RequestMethod.GET) // resouce url = helloWithData , method = GET
public ModelAndView getHello() {

return  new ModelAndView("response","message", "hi from backend.. .."); 




//12---------------------------------------------------------------------------------------------------------------------------------------



}
@RequestMapping(value = "/helloWithMultiData1",method = RequestMethod.GET)
public ModelAndView getMultiData() {

ModelAndView responseObj = new ModelAndView("response1");

	responseObj.addObject("age", 34);
	responseObj.addObject("name", "ramesh");
	responseObj.addObject("id", 3000);
	responseObj.addObject("sal", 1133.1331f);
	return responseObj;

}





//13-----------------------------------------------------------------------------------------------------------------------------------------

@RequestMapping(value = "/helloWithMultiData2",method = RequestMethod.GET)
public ModelAndView getHelloWithMap() {
//create map
Map<String, Object> map = new HashMap<String, Object>();

//add response data to map
	map.put("age", 34);
	map.put("name", "ramesh");
	map.put("id", 3000);
	map.put("sal", 1133.1331f);

//add map to the response obj
	return new ModelAndView("response2", map); // 
	//response2.jsp is the respone jsp and map contains response data
}



//14-----------------------------------------------------------------------------------------------------------------------------------------



@RequestMapping(value = "/helloWithObject", method = RequestMethod.GET)
public ModelAndView sendObj() {
ModelAndView modelAndView = new ModelAndView("empResponse"); // here empResponse.jsp is the response page

//create employee obj
	Employee employee = new Employee(23, 12121, "user1", "shyam", 13131313);
//add response data
	modelAndView.addObject("message", "process successful...");
	modelAndView.addObject("emps", employee); 
// we are sending employee obj + string to the response page.
	
return modelAndView;
}



//15---------------------------------------------------------------------------------------------------------------------------------------


@RequestMapping(value = "/check", method = RequestMethod.GET)
public ModelAndView check() {
	ModelAndView modelAndView = new ModelAndView("checkResponse");
	modelAndView.addObject("age", 18);
	modelAndView.addObject("name", "teja");
	return modelAndView;
}



//16---------------------------------------------------------------------------------------------------------------------------------------


@RequestMapping(value = "/strList", method = RequestMethod.GET)
public ModelAndView sendStrrList() {
	ModelAndView modelAndView = new ModelAndView("namesResponse");
	List<String> names= Arrays.asList("hyd","bang","chennai","mumbai","bangalore");
	modelAndView.addObject("names", names);
	return modelAndView;
}



//17------------------------------------------------------------------------------------------------------------------------------------


@RequestMapping(value = "/empList", method = RequestMethod.GET)
public ModelAndView sendList() {
	ModelAndView response = new ModelAndView("empsResponse");
//here empsResponse.jps is the response jsp
	

//create employee list
	List<Employee> emps = new ArrayList<>();
	for(int i=0;i<10;i++){
//create emp obj
		Employee employee = new Employee(30+i, 5000+i, "user"+i, "kumar"+i, 10000+i);
  //add emp obj to list
		emps.add(employee);
	}
	     
//add list of emp objs to response     
	response.addObject("emps", emps);
	return response;
} 

  
}