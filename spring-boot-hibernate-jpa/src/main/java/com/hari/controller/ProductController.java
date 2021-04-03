package com.hari.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.hari.TestApp;
import com.hari.exception.ServiceException;
import com.hari.service.ProductService;
import com.hari.util.Product;
import com.hari.util.ProductResponseInfo;

import io.swagger.annotations.ApiOperation;

@Controller
//@RestController

@ApiOperation(value = "Product/",tags = "Product Controller swagger ")
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService articleService;

	@ApiOperation(value = "Get by product id",consumes = "json",notes = "Swagger info getting id")
	// @GetMapping(value="product/{id}" , produces = "application/json")
	@RequestMapping(value = "product/{id}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<ProductResponseInfo> getArticleById(@PathVariable("id") Integer id) {
		Product article = articleService.getArticleById(id);
		if (article == null) {
			ProductResponseInfo response = new ProductResponseInfo("Invalid product Id.");
			return new ResponseEntity<ProductResponseInfo>(response, HttpStatus.OK);
		}
		ProductResponseInfo response = new ProductResponseInfo("Success", article);
		return new ResponseEntity<ProductResponseInfo>(response, HttpStatus.OK);
	}


	
	
	@ApiOperation(value = "Get all the Products swagger",response = Product.class)
	@RequestMapping(value = "products", produces = "application/json")
	public ResponseEntity<ProductResponseInfo> getAllArticles() {
		logger.error("getAllArticles started");

		List<Product> list = articleService.getAllArticles();
		ProductResponseInfo response = new ProductResponseInfo("Success", list);
		
		logger.error("getAllArticles ended");

		return new ResponseEntity<ProductResponseInfo>(response, HttpStatus.OK);
	}

	// @PostMapping(value= "product" , consumes = "application/json" ,produces ="application/json")
	@RequestMapping(value = "product", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<ProductResponseInfo> addArticle(@RequestBody Product article, UriComponentsBuilder builder) {
		Product product = articleService.addArticle(article);
		if (product==null) {
			List<Product> list = new ArrayList<>();
			ProductResponseInfo response = new ProductResponseInfo("Product id already exists", list);
			return new ResponseEntity<ProductResponseInfo>(response, HttpStatus.BAD_REQUEST);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/article/{id}").buildAndExpand(product.getArticleId()).toUri());
		List<Product> list = new ArrayList<>();
		list.add(product);
		ProductResponseInfo response = new ProductResponseInfo("Success", list);
		return new ResponseEntity<ProductResponseInfo>(response, headers, HttpStatus.CREATED);
	}

	// @PutMapping(value = "product", produces = "application/json")
	@RequestMapping(value = "product", consumes = "application/json", produces = "application/json", method = RequestMethod.PUT)
	public ResponseEntity<String> updateArticle(@RequestBody Product article) {
		try {
			articleService.updateArticle(article);
		} catch (ServiceException ex) {
			return new ResponseEntity<String>("Product update failed. Reason " + ex.getMsg(), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product update success.", HttpStatus.OK);
	}

	// @DeleteMapping(value= "product/{id}" , produces = "application/json")
	@RequestMapping(value = "product/{id}", produces = "application/json", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteArticle(@PathVariable("id") Integer id) {
		try {
			articleService.deleteArticle(id);
		} catch (ServiceException ex) {
			return new ResponseEntity<String>("Product DELETE failed. Reason " + ex.getMsg(), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product DELETE success.", HttpStatus.OK);
	}
}

