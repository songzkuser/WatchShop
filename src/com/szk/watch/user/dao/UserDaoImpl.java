package com.szk.watch.user.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.User;

@Repository
public class UserDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public void Regist() {
		
	}
	
	public void Saveuser(String name,String pwd,String Email,String Mobile){
		Session s=this.sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		
		User user=new User();
		user.setUserName(name);
		user.setPassword(pwd);
		user.setEmail(Email);
		user.setMobile(Mobile);
		
		
		s.save(user);
		t.commit();
		s.close();
		
	}
	
	public User findById(String name){
		return this.sessionFactory.getCurrentSession().get(User.class, name);
	}
}
