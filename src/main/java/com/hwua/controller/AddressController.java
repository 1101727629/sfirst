package com.hwua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Address;
import com.hwua.entity.Product;
import com.hwua.entity.User;
import com.hwua.service.ShoopService;
@Controller
public class AddressController {
	private ShoopService shoopService;
	@Autowired
	public AddressController(ShoopService shoopService) {
		
		this.shoopService = shoopService;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipAddress")
	public String addressview(@AuthenticationPrincipal(expression="user")User user,Model model){
		long id = user.getId();
		List<Address> addres= shoopService.findAll(id);
		model.addAttribute("user", user);
		model.addAttribute("addres", addres);
		return "vipAddress";
	}
	
	
	//返回ajax
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public @ResponseBody Address addview(@RequestBody Address addres,Model model){
		Address addres1 = shoopService.findIdOneAddres(addres.getId());
		/*model.addAttribute("addres", addres1);
*/
	  		return addres1;
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/adds")
	public String addAddress(@AuthenticationPrincipal(expression="user")User user,@ModelAttribute Address addres,Model model){
		if(addres.getId()!=null){
			shoopService.updateAddress(addres);
			return "redirect:/vipAddress";
		}
		long id = user.getId();
		addres.setReqId(id);
		shoopService.addAddress(addres);
	  		return "vipAddress";
	}	
}
