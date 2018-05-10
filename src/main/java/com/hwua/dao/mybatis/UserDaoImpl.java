package com.hwua.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.UserDao;
import com.hwua.dao.mybatis.mappers.UserMapper;
import com.hwua.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserMapper userMapper;
	public UserDaoImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public User findOneByUsername(String username) {
		return userMapper.findOneByUsername(username);
	}

}
