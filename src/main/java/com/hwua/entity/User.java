package com.hwua.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





/*create table reg(
id number(11) primary key,
uname varchar2(64) unique,
email varchar2(64),
phone varchar2(20),
password varchar2(64),
verification varchar2(64),
uniquezi number(2) not null 
);*/
public class User {
private long id;
@Size(min = 6, max = 64, message = "6 ~ 64长度")
private String uname;
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
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
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
	return "User [id=" + id + ", uname=" + uname + ", email=" + email + ", phone=" + phone + ", password=" + password
			+ ", verification=" + verification + ", uniquezi=" + uniquezi + "]";
}

}
