package com.hwua.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.ShoopDao;
import com.hwua.dao.mybatis.mappers.ShoopMapper;
import com.hwua.entity.User;
@Repository
public class ShoopDaoImpl implements ShoopDao{
private ShoopMapper shoopMapper;
   @Autowired
	public ShoopDaoImpl(ShoopMapper shoopMapper) {
	
	this.shoopMapper = shoopMapper;
}

	public void registered(User user) {
		  shoopMapper.registered(user);
		 
		
	}

}
