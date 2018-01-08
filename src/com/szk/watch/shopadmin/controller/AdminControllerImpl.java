package com.szk.watch.shopadmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.watch;
import com.szk.watch.shopadmin.service.AdminSecviceImpl;

@Controller
@RequestMapping("admin")
public class AdminControllerImpl {
	
	@Resource
	private AdminSecviceImpl adminSecviceImpl;
	
	@RequestMapping("/select")
	public String getall(Model model){
		List<watch> shop=this.adminSecviceImpl.showall();	
		model.addAttribute("shop", shop);
		return "Admin/result";
	}
	
	@RequestMapping("/delete")
	public String delect(@RequestParam("num") String num,Model model){
		this.adminSecviceImpl.delwatch(num);
		List<watch> shop=this.adminSecviceImpl.showall();
		model.addAttribute("shop", shop);
		return "Admin/result";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("num") String num,@RequestParam("name") String name,@RequestParam("price") Double price,
			@RequestParam("img") String img,@RequestParam("type") String type,Model model){
		this.adminSecviceImpl.addwatch(num, name, price, img,type);
		List<watch> shop=this.adminSecviceImpl.showall();
		model.addAttribute("shop", shop);
		return "Admin/result";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("num") String num,@RequestParam("price") Double price,Model model){
		this.adminSecviceImpl.updatewatch(num, price);
		List<watch> shop=this.adminSecviceImpl.showall();
		model.addAttribute("shop", shop);
		return "Admin/result";
	}
	

}
