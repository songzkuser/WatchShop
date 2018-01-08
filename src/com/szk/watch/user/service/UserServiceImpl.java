package com.szk.watch.user.service;

import java.util.jar.Attributes.Name;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.User;
import com.szk.watch.user.dao.UserDaoImpl;

@Service
@Transactional(readOnly=false)
public class UserServiceImpl {
	@Resource
	private UserDaoImpl userDaoImpl;
	
	public void regist(String name,String pwd,String Email,String Mobile){
		this.userDaoImpl.Saveuser(name, pwd, Email, Mobile);
	}
	
	public User login(String name, String password){
		User U=this.userDaoImpl.findById(name);
		if(U!=null){
			if(U.getPassword().equals(password)){
				return U;
			}else{
				System.out.println("输入密码错误，请输入正确的密码");
				return null;
			}
		}else{
			System.out.println("用户名称不存在");
			return null;
		}
	}
	
}
