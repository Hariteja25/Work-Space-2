package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import dto.Product;
import service.VehicleService;

@Controller
public class MyController {
@Autowired
VehicleService Vservice;
	
//Get All Products
	@RequestMapping(value="/vehicles",method=RequestMethod.GET,produces= {"application/json"})
	public ResponseEntity <List<Product>> getAllVehicles(){
		List<Product> list=Vservice.getAllVehicles();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);	
	}
	
	
	//Get Product by Id
	@RequestMapping(value="vehicle/{id}",method=RequestMethod.GET,produces= {"application/json"})
	public ResponseEntity<Product> getbyId( @PathVariable("id") int id){
		
		Product p=Vservice.getprobyId(id);
		return new ResponseEntity(p,HttpStatus.OK);
		
	}
	
	
	//Delete by id
	@RequestMapping(value="vehicle/{id}",method=RequestMethod.DELETE,produces= {"application/json"})
	public ResponseEntity<Void> deletebyId( @PathVariable("id") int id){
		Vservice.deletevehicle(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}

	
	
	@RequestMapping(value="vehicle",method=RequestMethod.POST,consumes= {"application/json"},produces= {"application/json"})
	public ResponseEntity<Void> addVehicle(@RequestBody Product vehicle ,UriComponentsBuilder builder){
		Boolean flag= Vservice.addvehicle(vehicle);
		if (!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	HttpHeaders h=new HttpHeaders();
	h.setLocation(builder.path("/vehicle/{id}").buildAndExpand(vehicle.getId()).toUri());
	return new ResponseEntity<Void>(h, HttpStatus.CREATED);
}
	
	
	@RequestMapping(value = "vehicle", produces = "application/json", method = RequestMethod.PUT)
	public ResponseEntity<Product> updateArticle(@RequestBody Product vehicle) {
		Vservice.updateVehicle(vehicle);
		return new ResponseEntity<Product>(vehicle, HttpStatus.OK);
	}
	
}
