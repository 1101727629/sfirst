package com.hwua.dao.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hwua.entity.Order;

public interface OrderMapper {

	void deletcar(Long id);
	void addorder(@Param(value = "addresId")Long addresId,@Param(value = "productId")Long productId,@Param(value = "userId") long userId,@Param(value = "shopCount") long shopCount);
	List<Order> findAll(long userId);
	Order findOne(Long id);
}
