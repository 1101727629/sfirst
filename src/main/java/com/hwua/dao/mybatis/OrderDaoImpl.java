package com.hwua.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.OrderDao;
import com.hwua.dao.mybatis.mappers.CarMapper;
import com.hwua.dao.mybatis.mappers.OrderMapper;
import com.hwua.entity.Car;
import com.hwua.entity.Order;

@Repository
public class OrderDaoImpl implements OrderDao{
 private OrderMapper orderMapper;
 private CarMapper carMapper;	
 @Autowired
	public OrderDaoImpl(OrderMapper orderMapper,CarMapper carMapper) {
	this.orderMapper = orderMapper;
	this.carMapper = carMapper;
}



	@Override
	public void deletcar(Long id) {
		orderMapper.deletcar(id);
		
	}

	@Override
	public void addorder(Long addresId, Long productId, long userId,Long shopCount) {
		orderMapper.addorder(addresId, productId,userId,shopCount);
		
	}



	@Override
	public Car findOneCar(Long id) {
		return carMapper.findIdOneCar(id);
		 
	}



	@Override
	public List<Order> findAll(long userId) {
		return orderMapper.findAll(userId);
		 
	}



	@Override
	public Order findOne(Long id) {
		return 	orderMapper.findOne(id);
	}


 
}
