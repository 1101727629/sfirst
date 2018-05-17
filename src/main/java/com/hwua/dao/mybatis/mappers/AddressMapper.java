package com.hwua.dao.mybatis.mappers;

import java.util.List;

import com.hwua.entity.Address;

public interface AddressMapper {
	void addAddress(Address addres);
	List<Address> findAll(long id);
	void updateAddress(Address addres);
	Address findIdOneAddres(Long id);
}
