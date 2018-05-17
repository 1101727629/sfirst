package com.hwua.service;

import java.util.List;

import com.hwua.entity.Address;
import com.hwua.entity.Product;
import com.hwua.entity.User;

public interface ShoopService {

void registered(User user);

void vipupdate(User user);

void updatePwd(long id, String PassWord);

void addAddress(Address addres);

void add(Product pro);

List<Address> findAll(long id);

void updateAddress(Address addres);

Address findIdOneAddres(Long id);









	

}
