package com.hari.util;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Product1234")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 7946229095299118411L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "articleid")
	@ApiModelProperty(notes = "This is product id which is auto generated",name = "articleId",required = true,value = "725")
	private int articleId;

	@Column(name = "title")
	@ApiModelProperty(notes = "This is product title ",name = "title",required = true,value = "RealMe")
	private String title;

	@Column(name = "category")
	@ApiModelProperty(notes = "This is product category ",name = "category",required = true,value = "Android")
	private String category;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}