package com.hari.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hari.exception.ServiceException;
import com.hari.service.ProductService;
import com.hari.util.Product;

@Transactional
@Repository(value = "dao2")
public class ProductDAO {
	private static final Logger logger = LoggerFactory.getLogger(ProductDAO.class);

@PersistenceContext
private EntityManager entityManager;

public Product getArticleById(int articleId) {
return entityManager.find(Product.class, articleId);
}

@SuppressWarnings("unchecked")
public List<Product> getAllArticles() {
	logger.error(" dao  getAllArticles started");
String hql = "FROM Product as atcl ORDER BY atcl.articleId";
return (List<Product>) entityManager.createQuery(hql).getResultList();
}


	/*
	 * public void addArticle(Product article) {
	 *  entityManager.merge(article); 
	 *  }
	 */
public Product addArticle(Product article) {
Product product = entityManager.merge(article);
return product;
}

public void updateArticle(Product article) {
Product artcl = getArticleById(article.getArticleId());
if(artcl==null) {
throw new ServiceException("Invalid product id","");
}
artcl.setTitle(article.getTitle());
artcl.setCategory(article.getCategory());
entityManager.flush();
}



public void deleteArticle(int articleId) {
Product artcl = getArticleById(articleId);
if(artcl==null) {
throw new ServiceException("Invalid product id","");
}
entityManager.remove(getArticleById(articleId));
}



public boolean articleExists(String title, String category) {
String hql = "FROM Product as atcl WHERE atcl.title = :title and atcl.category = :category";
int count = entityManager.createQuery(hql).setParameter("title", title)
.setParameter("category", category).getResultList().size();
return count > 0 ? true : false;
}
}





