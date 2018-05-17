package com.hwua.entity;
public class Address {
 private Long id;
 private long reqId;
 private String name;
 private String area;
 private String address;
 private String zipCode;
 private String phone;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public long getReqId() {
	return reqId;
}
public void setReqId(long reqId) {
	this.reqId = reqId;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
 
}
