package com.szk.watch.entity;

import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="watch")
public class watch {
	private int id;
	private String name;
	private String type;
	private String num;
	private double price;
	private String img;	
	
	
	@Id
	@GeneratedValue(generator="in")
    @GenericGenerator(name="in", strategy="increment")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@ManyToOne
//	@JoinColumn(name="Category")
//	public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		this.category = category;
//	}
	
	public double getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNum() {
		return num;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
