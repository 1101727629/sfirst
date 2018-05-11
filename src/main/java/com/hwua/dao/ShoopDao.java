package com.hwua.dao;

import com.hwua.entity.Product;
import com.hwua.entity.User;

public interface ShoopDao {

void registered(User user);

void add(Product pro);

void vipupdate(User user);

}
