package com.hwua.dao;

import java.util.List;

import com.hwua.entity.Car;

public interface CarDao {

	Car findOneCar(long userId, Long productId);

	void createCar(long userId, Long productId);

	void addCarCount(long userId, Long productId);

	List<Car> findAll(long id);

	void addIdCarCount(Long id);

	Car findIdOneCar(Long id);

}
