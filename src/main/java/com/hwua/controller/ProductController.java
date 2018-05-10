package com.hwua.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwua.entity.Product;
import com.hwua.service.ShoopService;
@Controller
public class ProductController {
	private String uploadDir = "E:/img"; // TODO 配置外部化
	private ShoopService shoopService;
	@Autowired
	public ProductController(ShoopService shoopService) {
		
		this.shoopService = shoopService;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vip/product")
	public String productview(){
	  		return "vip-product";
	}


@RequestMapping(method = RequestMethod.POST, value = "/vip/product")
public String productadd(@ModelAttribute Product pro,Model model) throws IllegalStateException, IOException{
	
if(pro.getTitle()==null||pro.getTitle().trim().isEmpty()||pro.getPicture()==null||pro.getPicture().isEmpty()||pro.getPhone_name()==null
||pro.getPhone_name().trim().isEmpty()||pro.getPrice()==null||pro.getIntroduce()==null||pro.getIntroduce().trim().isEmpty()){
	String erro="Information is incomplete, release failure!";
	model.addAttribute("erro",erro);
	System.out.println("2332132");
	return "vip-product";
}

pro.getPicture().transferTo(new File(uploadDir,pro.getPicture().getOriginalFilename()));
String filename = pro.getPicture().getOriginalFilename();
pro.setImg(filename);
shoopService.add(pro);
/*String mes="Release success!";
model.addAttribute("mes",mes);*/
	return "index";



}

}