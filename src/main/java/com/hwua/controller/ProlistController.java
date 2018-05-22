package com.hwua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Address;
import com.hwua.entity.Car;
import com.hwua.entity.Product;
import com.hwua.entity.User;
import com.hwua.service.CarService;
import com.hwua.service.ShoopService;

@Controller
public class ProlistController {
	private ShoopService shoopService;
	private CarService carService;
	@Autowired
	public ProlistController(ShoopService shoopService,CarService carService) {
		this.shoopService = shoopService;
		this.carService = carService;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String addressview(@AuthenticationPrincipal(expression="user")User user,Model model){
		List<Product> product =shoopService.findProduct();
		model.addAttribute("product", product);
	return "prolist";
	}
	@RequestMapping(method=RequestMethod.POST,value="/addCarCount")
	public @ResponseBody
	Car addCarCount(@AuthenticationPrincipal(expression="user") User user,@RequestBody Car car){
		System.err.println(car);
		carService.addIdCarCount(car.getId());
		return carService.findIdOneCar(car.getId());
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/car")
	 	public String findCar(@AuthenticationPrincipal(expression="user") User user,Model model){
	 		List<Address> address = shoopService.findAll(user.getId());
	 		model.addAttribute("address", address);
	 		List<Car> cars = carService.findAll(user.getId());
	 		model.addAttribute("cars", cars);
	 		System.err.println(cars);
	 		return "car";
	 	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/addCar")
	public @ResponseBody
	Car addCar(@AuthenticationPrincipal(expression="user") User user,@RequestParam Long id){
	Car car = carService.findOneCar(user.getId(),id);
	System.out.println(car);
	if(car==null){
	carService.createCar(user.getId(),id);
	}else{
	carService.addCarCount(user.getId(),id);
	}
	return null;
	}
	@RequestMapping(method=RequestMethod.GET,value="/addCar/{id}")
	public String addCar1(@AuthenticationPrincipal(expression="user") User user,@PathVariable Long id){
		Car car = carService.findOneCar(user.getId(),id);
		System.out.println(car);
		if(car==null){
			carService.createCar(user.getId(),id);
		}else{
			carService.addCarCount(user.getId(),id);
		}
		return "car";
	}
}
