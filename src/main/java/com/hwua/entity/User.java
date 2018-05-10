package com.hwua.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class User {
private long id;
@Size(min = 6, max = 64, message = "6 ~ 64长度")
private String username;
@NotNull(message = "必填")
@Email(regexp="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$",message="邮箱号不符合规则")
private String email;
@Pattern(regexp="^1[3|4|5|7|8][0-9]{9}$",message="手机号不符合规则")
private String phone;
@Size(min = 6, max = 64, message = "6 ~ 64长度")
private String password;
private String pwd1;

private String verification;
private int uniquezi;

private String name;
private String city;
private String sex;
private String idcard;
private String sysopsis;
private String category;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getIdcard() {
	return idcard;
}
public void setIdcard(String idcard) {
	this.idcard = idcard;
}
public String getSysopsis() {
	return sysopsis;
}
public void setSysopsis(String sysopsis) {
	this.sysopsis = sysopsis;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getPwd1() {
	return pwd1;
}
public void setPwd1(String pwd1) {
	this.pwd1 = pwd1;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getVerification() {
	return verification;
}
public void setVerification(String verification) {
	this.verification = verification;
}
public int getUniquezi() {
	return uniquezi;
}
public void setUniquezi(int uniquezi) {
	this.uniquezi = uniquezi;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", email=" + email + ", phone=" + phone + ", password=" + password
			+ ", verification=" + verification + ", uniquezi=" + uniquezi + "]";
}
public String getRole() {
	// TODO Auto-generated method stub
	return null;
}

}
