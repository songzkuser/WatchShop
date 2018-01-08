package com.szk.watch.user.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.User;
import com.szk.watch.user.service.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserControllerImpl {
	@Resource
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/regist")
	public String regist(@RequestParam("userName") String name,@RequestParam("password") String pwd,
			@RequestParam("Email") String Email,@RequestParam("Mobile") String Mobile){
		this.userServiceImpl.regist(name,pwd,Email,Mobile);
		return "login";
	}
	
	@RequestMapping("/login")
	public void login(@RequestParam("userName") String name,
			@RequestParam("password") String pwd,HttpServletResponse response,
			HttpSession session,Model model) throws IOException {
		User u=this.userServiceImpl.login(name, pwd);
		Double money = null;
		session.setAttribute("money", money);
		if(u!=null){
			session.setAttribute("u", u);
			response.sendRedirect("/Watchshop/watch/list");
		}else{
			model.addAttribute("erroinfo", "您的账号密码不正确！");
			response.sendRedirect("/Watchshop/login.jsp");
		}
		
	}

}
