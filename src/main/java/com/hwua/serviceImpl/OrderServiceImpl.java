package com.hwua.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.OrderDao;
import com.hwua.entity.Car;
import com.hwua.entity.Order;
import com.hwua.service.OrderService;
@Service
public  class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;
	@Autowired
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	

	@Override
	public void deletcar(List<Long> carId) {
		for(Long id:carId){
			orderDao.deletcar(id);
		}
	}

	@Override
	public void addorder(Long addresId, List<Long> carId, long userId) {
for(Long id:carId){
		  Car car = orderDao.findOneCar(id);
		    Long shopCount = car.getShopCount();
			Long productId = car.getProduct_id();
			System.out.println(productId);
			orderDao.addorder(addresId,productId,userId,shopCount);
		}
	}



	@Override
	public List<Order> findAll(long userId) {
		return orderDao.findAll(userId);
	}



	@Override
	public Order findOne(Long id) {
		
		return orderDao.findOne(id);
	}





}
