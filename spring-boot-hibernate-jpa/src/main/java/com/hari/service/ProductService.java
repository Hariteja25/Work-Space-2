package com.hari.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.dao.ProductDAO;
import com.hari.util.Product;
@Service(value = "pService")
public class ProductService {
	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	@Autowired
	private ProductDAO dao;
	
	public Product getArticleById(int articleId) {
		Product obj = dao.getArticleById(articleId);
		return obj;
	}	
	public List<Product> getAllArticles(){
		logger.error(" service getAllArticles started");
		return dao.getAllArticles();
	}

	public  Product addArticle(Product article){
        if (dao.articleExists(article.getTitle(), article.getCategory())) {
    	   return null;
       } else {
    	   Product product =dao.addArticle(article);
    	   return product;
       } 
		//dao.addArticle(article);
		 //return true;
	}

	public void updateArticle(Product article) {
		dao.updateArticle(article);
	}

	public void deleteArticle(int articleId) {
		dao.deleteArticle(articleId);
	}
}





