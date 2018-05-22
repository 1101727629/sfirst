package com.hwua.dao.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hwua.entity.Car;

public interface CarMapper {
	Car findOneCar(@Param(value = "userId") long userId, @Param(value = "productId") Long productId);

	void createCar(@Param(value = "userId") long userId,@Param(value = "productId")  Long productId);

	void addCarCount(@Param(value = "userId") long userId, @Param(value = "productId") Long productId);
	
	List<Car> findAll(long id);
	
	void addIdCarCount(Long id);

	Car findIdOneCar(Long id);

}
