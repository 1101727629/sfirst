package com.hwua.dao.mybatis.mappers;

import com.hwua.entity.User;

public interface ShoopMapper {
	void registered(User user);
	void vipupdate(User user);
}
