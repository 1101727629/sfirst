package com.hwua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwua.entity.Product;
import com.hwua.entity.User;
@Controller
public class VipController {
	@RequestMapping(method = RequestMethod.GET, value = "/vip")
	public String vipview(@ModelAttribute User user,Model model){
		
	  		return "vip";
	}
}
