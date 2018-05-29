package com.hwua.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.javassist.compiler.ast.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hwua.entity.Address;
import com.hwua.entity.Car;
import com.hwua.entity.Order;
import com.hwua.entity.User;
import com.hwua.service.OrderService;

@Controller
public class OrderController {
	private OrderService orderService;
		@Autowired
 		public OrderController(OrderService orderService) {
			this.orderService = orderService;
}
		
		@RequestMapping(method =RequestMethod.GET,value ="/order")
		public String viewOrder(@AuthenticationPrincipal(expression="user")User user,Model model){
			List<Order> order =	orderService.findAll(user.getId());
			
			System.out.println(order);
			model.addAttribute("order", order);
			return "vipOrder";
		}
		@RequestMapping(method =RequestMethod.GET,value ="/vipXiao/{id}")
		public String viewOnrOrder(@PathVariable Long id, Model model){
		Order order  =	orderService.findOne(id);
		model.addAttribute("order", order);
			return"vipXiaofei";
		}
		@RequestMapping(method = RequestMethod.POST, value = "/addorder")
		public String addorder(@AuthenticationPrincipal(expression="user")User user,@RequestParam Long addresId,@RequestParam List<Long> id,Model model){
		System.out.println(id);	
		if(addresId==null||id==null){
			model.addAttribute("erro", "请选择地址或订单");
			return "car";
		}
		long userId = user.getId();
		
			orderService.addorder(addresId,id,userId);
			orderService.deletcar(id);
			return "index";
		}
  
	
}
