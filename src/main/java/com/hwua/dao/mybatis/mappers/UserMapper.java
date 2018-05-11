package com.hwua.dao.mybatis.mappers;

import com.hwua.entity.User;

public interface UserMapper {
	User findOneByUsername(String username);
	
	
}
