package com.hwua.dao;

import java.util.List;

import com.hwua.entity.Address;
import com.hwua.entity.Product;
import com.hwua.entity.User;

public interface ShoopDao {

void registered(User user);

void add(Product pro);

void vipupdate(User user);

void updatePwd(long id, String encodedPassword);

void addAddress(Address addres);

List<Address> findAll(long id);

void updateAddress(Address addres);

Address findIdOneAddres(Long id);



}
