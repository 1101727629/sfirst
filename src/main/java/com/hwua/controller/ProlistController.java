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
		carService.addIdCarCount(car.getId());
		return carService.findIdOneCar(car.getId());
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/car")
	 	public String findCar(@AuthenticationPrincipal(expression="user") User user,Model model){
	 		List<Address> address = shoopService.findAll(user.getId());
	 		model.addAttribute("address", address);
	 		List<Car> cars = carService.findAll(user.getId());
	 		model.addAttribute("cars", cars);
	 		return "car";
	 	}
	@RequestMapping(method=RequestMethod.GET,value="/minus")
	public @ResponseBody
	Car minus(@AuthenticationPrincipal(expression="user") User user,@RequestParam Long id,@RequestParam Long shopCount){
		if(shopCount<=1){
			carService.deleteCar(id);
		}else{
			carService.minusCount(id);
			}
		return carService.findIdOneCar(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addCar")
	public @ResponseBody
	Car addCar(@AuthenticationPrincipal(expression="user") User user,@RequestBody Product pro){
	Car car = carService.findOneCar(user.getId(),pro.getId());
	if(car==null){
	carService.createCar(user.getId(),pro.getId());
	}else{
	carService.addCarCount(user.getId(),pro.getId());
	}
	return null;
	}
	@RequestMapping(method=RequestMethod.GET,value="/deleteCar")
	public @ResponseBody Car deleteCar (@AuthenticationPrincipal(expression="user") User user,@RequestParam Long id){
		carService.deleteCar(id);
		return new Car();
		
	}
	@RequestMapping(method=RequestMethod.GET,value="/deleteAllCar")
	public String deleteAllCar (@AuthenticationPrincipal(expression="user") User user){
		carService.deleteAllCar(user.getId());
		return "car";
	}
	@RequestMapping(method=RequestMethod.GET,value="/addCar/{id}")
	public String addCar1(@AuthenticationPrincipal(expression="user") User user,@PathVariable Long id){
		Car car = carService.findOneCar(user.getId(),id);
		if(car==null){
			carService.createCar(user.getId(),id);
		}else{
			carService.addCarCount(user.getId(),id);
		}
		return "car";
	}
	
	
	
	
	
}
