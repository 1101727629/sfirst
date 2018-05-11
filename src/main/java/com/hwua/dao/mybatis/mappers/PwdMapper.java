package com.hwua.dao.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

public interface PwdMapper {

	void updatePwd(@Param(value = "id") long id, @Param(value = "encodedPassword")String encodedPassword);

	
	
	
}
