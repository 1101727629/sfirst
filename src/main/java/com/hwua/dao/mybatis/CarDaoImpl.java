package com.hwua.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwua.dao.CarDao;
import com.hwua.dao.mybatis.mappers.CarMapper;
import com.hwua.entity.Car;

@Repository
public class CarDaoImpl implements CarDao{
private CarMapper carMapper;
    @Autowired
	public CarDaoImpl(CarMapper carMapper) {
	this.carMapper = carMapper;
}

	@Override
	public Car findOneCar(long userId, Long productId) {
		return carMapper.findOneCar(userId, productId);
	}

	@Override
	public void createCar(long userId, Long productId) {
		carMapper.createCar(userId, productId);
		
	}

	@Override
	public void addCarCount(long userId, Long productId) {
		carMapper.addCarCount(userId, productId);
		
	}

	@Override
	public List<Car> findAll(long id) {
		
		return carMapper.findAll(id);
	}

	@Override
	public void addIdCarCount(Long id) {
		carMapper.addIdCarCount(id);
		
	}

	@Override
	public Car findIdOneCar(Long id) {
		return carMapper.findIdOneCar(id);
		 
	}

	

}
