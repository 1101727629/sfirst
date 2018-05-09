package com.hwua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwua.entity.User;
import com.hwua.service.ShoopService;

@Controller
public class ShoopController {
	
	private ShoopService shoopService;
	@Autowired
	public ShoopController(ShoopService shoopService) {
		
		this.shoopService = shoopService;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/req")
	public String regis(@ModelAttribute User user){	
		return "req";
	}
	@RequestMapping(method = RequestMethod.POST,value="/req")
	public String registered(@Valid @ModelAttribute User user,BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return "req";
		}else{
		 shoopService.registered(user);
			  return "login";
		}
		
	  
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login(){
		
		return "login";
	}
}
