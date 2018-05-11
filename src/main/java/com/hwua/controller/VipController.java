package com.hwua.controller;


import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwua.entity.User;
import com.hwua.service.ShoopService;
@Controller
public class VipController {
	private String uploadDir = "E:/img"; // TODO 配置外部化
	private ShoopService shoopService;
	@Autowired
	public VipController(ShoopService shoopService) {
		
		this.shoopService = shoopService;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vip")
	public String vipview( @AuthenticationPrincipal(expression="user")User cususer,Model model){
		model.addAttribute("user",cususer);
	  		return "vip";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/vip")
	public String vipupdate( 
			@AuthenticationPrincipal(expression="user")User user1,
			@Valid@ModelAttribute User user, BindingResult bindingResult,
			Model model) throws IllegalStateException, IOException{
		if (bindingResult.hasErrors()) {
			System.err.println(bindingResult.getAllErrors());
			return "vip";
		}else{	
		System.out.println("---");
		user.getPicture().transferTo(new File(uploadDir,user.getPicture().getOriginalFilename()));
		String filename = user.getPicture().getOriginalFilename();
		user.setImgs(filename);
		long id =user1.getId();
		user.setId(id);
		shoopService.vipupdate(user);
	  		return "index";}
	}
	

}
