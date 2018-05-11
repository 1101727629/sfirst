package com.hwua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwua.entity.Pwd;
import com.hwua.entity.User;
import com.hwua.service.ShoopService;

@Controller
public class PwdController {
	private ShoopService shoopService;
	@Autowired
	public PwdController(ShoopService shoopService) {
		
		this.shoopService = shoopService;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vipPwd")
	public String vipPwdView(@AuthenticationPrincipal(expression="user")User cususer,Model model){
		model.addAttribute("user",cususer);
	  		return "vipPwd";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/vipPwd")
	public String 	updatePwd(@AuthenticationPrincipal(expression="user")User user,@ModelAttribute Pwd pwd,Model model){
	
	if(pwd.getPassWord()==null||pwd.getPassWord().trim().isEmpty()||pwd.getPassWord1()==null||pwd.getPassWord1().trim().isEmpty()){
		model.addAttribute("erro1","null");
		return "vipPwd";	
	}
	if(pwd.getPassWord().equals(pwd.getPassWord1())){
		long id =user.getId();
		String PassWord =pwd.getPassWord();
		String PsaaWord1=pwd.getPassWord1();
		shoopService.updatePwd( id,PassWord);
		return "login";
	}
	model.addAttribute("erro","The codes are different twice!");
	return "vipPwd";
	}
}
