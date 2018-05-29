package com.hwua.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.CarDao;
import com.hwua.entity.Car;
import com.hwua.service.CarService;

@Service
public class CarServiceImpl implements CarService{
  private CarDao carDao;
   @Autowired
	public CarServiceImpl(CarDao carDao) {
	this.carDao = carDao;
}

	@Override
	public Car findOneCar(long userId, Long productId) {
		return	carDao.findOneCar( userId, productId);
		
	}

	@Override
	public void createCar(long userId, Long productId) {
		carDao.createCar( userId, productId);
		
	}

	@Override
	public void addCarCount(long userId, Long productId) {
		carDao.addCarCount( userId, productId);
		
	}

	@Override
	public List<Car> findAll(long id) {
		
		return carDao.findAll(id);
	}

	@Override
	public void addIdCarCount(Long id) {
		carDao.addIdCarCount(id);
	}

	@Override
	public Car findIdOneCar(Long id) {
		
		return carDao.findIdOneCar(id);
	}

	@Override
	public void deleteCar(Long id) {
		carDao.deleteCar(id);
		
	}

	@Override
	public void minusCount(Long id) {
		carDao.minusCount(id);
		
	}

	@Override
	public void deleteAllCar(long id) {
	carDao.deleteAllCar(id);
		
	}



	

}
