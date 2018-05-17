package com.hwua.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.ShoopDao;
import com.hwua.dao.mybatis.mappers.AddressMapper;
import com.hwua.dao.mybatis.mappers.ProductMapper;
import com.hwua.dao.mybatis.mappers.PwdMapper;
import com.hwua.dao.mybatis.mappers.ShoopMapper;
import com.hwua.entity.Address;
import com.hwua.entity.Product;
import com.hwua.entity.User;
@Repository
public class ShoopDaoImpl implements ShoopDao{
private ShoopMapper shoopMapper;
private ProductMapper productMapper;
private PwdMapper pwdMapper;
private AddressMapper addressMapper;
   @Autowired
	public ShoopDaoImpl(ShoopMapper shoopMapper,ProductMapper productMapper, PwdMapper pwdMapper,AddressMapper addressMapper) {	
	this.shoopMapper = shoopMapper;
	this.productMapper =productMapper;
	this.pwdMapper = pwdMapper;
	this.addressMapper = addressMapper;
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
@Override
public void addAddress(Address addres) {
	addressMapper.addAddress(addres);
	
}
@Override
public List<Address> findAll(long id) {
	return addressMapper.findAll(id);
}
@Override
public void updateAddress(Address addres) {
	addressMapper.updateAddress(addres);
	
}
@Override
public Address findIdOneAddres(Long id) {

	return addressMapper.findIdOneAddres(id);
}


}
