package com.hk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hk.dto.EmpResponse;
import com.hk.dto.Employee;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@ApiModel(description = "Employee")
@RestController
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	@ApiOperation(value = "Hello",notes = "This is my sample api to return string data")
	@RequestMapping("/hello")
	public String getHello() {
	logger.info("Hello Started");	
	
		return "Welcome to Spring Boot project";//returns text
	}
	

	
	@RequestMapping("/hi")
	public String myData() {
		logger.info("Hi Started");
		return "Hello Spring Boot"; //returns text
	}

  
  
	 @RequestMapping(value = "/myjson", method =RequestMethod.GET, produces = {"application/json"})
		public ResponseEntity getJson() {
			EmpResponse emp =  new EmpResponse("success") ;
			return new ResponseEntity(emp, HttpStatus.OK); //returns response entity obj that has data + response code
		}
	  
	 
	 
	 @RequestMapping(value = "/myxml", method =RequestMethod.GET,produces = {"application/xml"})
		public ResponseEntity getXml() {
		 logger.info("Get xml  Started");
			EmpResponse emp =  new EmpResponse("success") ;
			 logger.warn("Get xml  Ended");
			return new ResponseEntity(emp, HttpStatus.OK); //returns response entity obj that has data + responsecode
		}

	    @RequestMapping(value = "/mydata", method =RequestMethod.GET,
				produces = {"application/xml","application/json"})
		public ResponseEntity getData() {
			EmpResponse emp =  new EmpResponse("success") ;
			return new ResponseEntity(emp, HttpStatus.ACCEPTED); //returns response entity obj that has data + responsecode
		}
	  
	    @RequestMapping("/data/{id}")
		public String getResponseWithPath(@PathVariable("id") int id) {
			return "[getEmp] Hello User "+ id;
		}

		 @RequestMapping(value= "/emp/{id}",produces =  {"application/json","application/xml"})
			public ResponseEntity getEmpById(@PathVariable("id") int id) {
				Employee e = new Employee(1000+id, "user"+id, id);
				return new ResponseEntity<>(e, HttpStatus.ACCEPTED);
			}
		  
		  
	    
	    
	    @RequestMapping("/dataParam")
		public String getResponseWithUrl(@RequestParam("id") int id) {
			return "[getResponseWithUrl] Your id = "+id;
		}
	    
	    
	    @RequestMapping(value= "/emp/{user}/{pass}",produces =  {"application/json","application/xml"})
		public ResponseEntity getEmpById(
				@PathVariable("user") String user,
				@PathVariable("pass") String pass) {
			if(user.equals(pass)) {
				EmpResponse emp =  new EmpResponse("Login success") ;
				return new ResponseEntity(emp, HttpStatus.OK);
			}else {
				EmpResponse emp =  new EmpResponse("Login failure") ;
				return new ResponseEntity(emp, HttpStatus.BAD_REQUEST);
			}
		}
	    
	    
	    @RequestMapping(value= "/emp",method = RequestMethod.POST , 
				consumes = {"application/json","application/xml"})
		public ResponseEntity createEmp(@RequestBody  Employee emp) {
			return new ResponseEntity<>(new EmpResponse("emp created for "+emp), HttpStatus.CREATED);
		}
		 
	  
	  
		@RequestMapping(value= "/emp",
				method = RequestMethod.PUT,
				consumes =  {"application/json","application/xml"} 
				)
		public ResponseEntity updateEmp(@RequestBody  Employee emp) {
			return new ResponseEntity<>(new EmpResponse("emp updated for "+emp), HttpStatus.OK);
		}
	  
		
		@RequestMapping(value= "/emp",
				method = RequestMethod.DELETE,
				produces =  {"application/json","application/xml"} 
				)
		public ResponseEntity deleteEmp(@RequestBody  Employee emp) {
			return new ResponseEntity<>(new EmpResponse("emp deleted for "+emp), HttpStatus.OK);
		}
	  
}


