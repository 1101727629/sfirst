package com.hwua.entity;

public class Car {
private Long id;
private Long product_id;
private Long user_id;
private Long carCount;
private Long shopCount;

private Product product;
private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getProduct_id() {
	return product_id;
}
public void setProduct_id(Long product_id) {
	this.product_id = product_id;
}
public Long getCarCount() {
	return carCount;
}
public void setCarCount(Long carCount) {
	this.carCount = carCount;
}
public Long getShopCount() {
	return shopCount;
}
public void setShopCount(Long shopCount) {
	this.shopCount = shopCount;
}
@Override
public String toString() {
	return "Car [id=" + id + ", product_id=" + product_id + ", user_id=" + user_id + ", carCount=" + carCount
			+ ", shopCount=" + shopCount + ", product=" + product + "]";
}

}
