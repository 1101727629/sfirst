package com.hwua.dao;

import java.util.List;

import com.hwua.entity.Car;
import com.hwua.entity.Order;

public interface OrderDao {



	void deletcar(Long id);

	

	Car findOneCar(Long id);

	List<Order> findAll(long userId);

	void addorder(Long addresId, Long productId, long userId, Long shopCount);



	Order findOne(Long id);



}
