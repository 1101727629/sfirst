package com.hwua.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.ShoopDao;
import com.hwua.dao.mybatis.mappers.ProductMapper;
import com.hwua.dao.mybatis.mappers.PwdMapper;
import com.hwua.dao.mybatis.mappers.ShoopMapper;
import com.hwua.entity.Product;
import com.hwua.entity.User;
@Repository
public class ShoopDaoImpl implements ShoopDao{
private ShoopMapper shoopMapper;
private ProductMapper productMapper;
private PwdMapper pwdMapper;
   @Autowired
	public ShoopDaoImpl(ShoopMapper shoopMapper,ProductMapper productMapper, PwdMapper pwdMapper) {	
	this.shoopMapper = shoopMapper;
	this.productMapper =productMapper;
	this.pwdMapper = pwdMapper;
}
   @Override
	public void registered(User user) {
		  shoopMapper.registered(user);
		 
		
	}
@Override
public void add(Product pro) {
	 productMapper.add(pro);
	
}
@Override
public void vipupdate(User user) {
	shoopMapper.vipupdate(user);
	
}
@Override
public void updatePwd(long id, String encodedPassword) {
	pwdMapper.updatePwd(id, encodedPassword);
	
}


}
