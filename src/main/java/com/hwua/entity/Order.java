package com.hwua.entity;

import java.util.Date;
import java.util.List;

public class Order {
private Long id;
private Long productId;
private Long userId;
private Long addressId;
private Date entlassung;
private String staat;//付款状态
private String method;//支付方式
private User user;
private List<Product> products;
private Address address;
private Long shopCount;

public Long getShopCount() {
	return shopCount;
}
public void setShopCount(Long shopCount) {
	this.shopCount = shopCount;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Long getAddressId() {
	return addressId;
}
public void setAddressId(Long addressId) {
	this.addressId = addressId;
}
public Date getEntlassung() {
	return entlassung;
}
public void setEntlassung(Date entlassung) {
	this.entlassung = entlassung;
}
public String getStaat() {
	return staat;
}
public void setStaat(String staat) {
	this.staat = staat;
}
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
@Override
public String toString() {
	return "Order [id=" + id + ", productId=" + productId + ", userId=" + userId + ", addressId=" + addressId
			+ ", entlassung=" + entlassung + ", staat=" + staat + ", method=" + method + ", user=" + user + ", product="
			+ products + ", address=" + address + "]";
}






}
