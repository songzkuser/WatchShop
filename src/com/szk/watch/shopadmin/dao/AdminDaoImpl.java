package com.szk.watch.shopadmin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.szk.watch.entity.watch;

@Repository
public class AdminDaoImpl {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<watch> shops(){
		Query query= (Query) sessionFactory.getCurrentSession().createQuery("from watch");
		 return query.list(); 
	}
	
	public void delwatch(String num) {
		sessionFactory.getCurrentSession().createQuery("delete watch w where w.num="+num).executeUpdate();
	}
	
	public void addwatch(watch w) {
		sessionFactory.getCurrentSession().save(w);
	}
	public void update(String num,Double p) {
		sessionFactory.getCurrentSession().createQuery("update watch w set w.price="+p+"where w.num="+num).executeUpdate();
	}
}
