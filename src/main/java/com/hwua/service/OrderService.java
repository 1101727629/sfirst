package com.hwua.service;

import java.util.List;

import com.hwua.entity.Car;
import com.hwua.entity.Order;

public interface OrderService {



	void deletcar(List<Long> carId);

	void addorder(Long addresId, List<Long> id, long userId);

	List<Order> findAll(long userId);

	Order findOne(Long id);


}
