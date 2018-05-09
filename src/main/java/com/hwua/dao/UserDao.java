package com.hwua.dao;

import com.hwua.entity.User;

public interface UserDao {
	User findOneByUsername(String username);
}
