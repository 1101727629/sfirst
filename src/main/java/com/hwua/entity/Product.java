package com.hwua.entity;

import org.springframework.web.multipart.MultipartFile;

public class Product {
private long id;
private String title;
private String img;
private Double price;
private String phone_name;
private String introduce;
private MultipartFile picture;
private Car car;

public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public MultipartFile getPicture() {
	return picture;
}
public void setPicture(MultipartFile picture) {
	this.picture = picture;
}
public long getId() {
	return id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getPhone_name() {
	return phone_name;
}
public void setPhone_name(String phone_name) {
	this.phone_name = phone_name;
}
public String getIntroduce() {
	return introduce;
}
public void setIntroduce(String introduce) {
	this.introduce = introduce;
}
public void setId(long id) {
	this.id = id;
}
@Override
public String toString() {
	return "Product [id=" + id + ", title=" + title + ", img=" + img + ", price=" + price + ", phone_name=" + phone_name
			+ ", introduce=" + introduce + ", picture=" + picture + ", car=" + car + "]";
}



}
