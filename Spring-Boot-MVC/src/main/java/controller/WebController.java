package controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import Service.ProductService;
import dto.Product;
import util.UserException;

@Controller
public class WebController {


	@GetMapping("/hello")
	public String t1() {
		return "index";
	}
	
	
	@GetMapping("addProduct")
	public ModelAndView showAddEmp() {
		Product p = new Product();
		return new ModelAndView("addPro", "command", p);
	}
	
	
/*	
	@PostMapping("/addProduct")
	public ModelAndView addproduct(@ModelAttribute("command") Product pro,BindingResult result) {
		if(result.hasErrors())
		{
			String message="Adding Product is Failed Due to Missing Data";
			ModelAndView model = new ModelAndView("addPro", "command", pro);
			model.addObject("msg", message);
			return model;
		}
		try {
			
			service.addProduct(pro);
		}
		
		catch (UserException e) 
		{
			String msg = e.getMessage();
			ModelAndView modelAndView = new ModelAndView("addPro", "command", pro);
			modelAndView.addObject("msg", msg);
			return modelAndView;
		}
		
		
		ModelAndView model = new ModelAndView("addPro", "msg", pro);
		model.addObject("msg", " Product Created...! Successfully ");
		return model;
		}
	
	
	
	
	@RequestMapping("/getAllProducts")
	public ModelAndView getAllPros() {
		List<Product> products = service.getProducts();
		return new ModelAndView("showProducts", "pros", products);
	}
	
	
	
	@PostMapping("/updateProduct")
	public ModelAndView showeditProduct() {
		Product p = new Product();
		return new ModelAndView("showupdateemp", "command", p);
	  }
*/
	
	
}
	
	
