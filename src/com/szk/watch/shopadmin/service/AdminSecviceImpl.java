package com.szk.watch.shopadmin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szk.watch.entity.watch;
import com.szk.watch.shopadmin.dao.AdminDaoImpl;

@Service
@Transactional
public class AdminSecviceImpl {
	
	@Resource
	private AdminDaoImpl adminDaoImpl;
	
	public List<watch> showall(){
		return this.adminDaoImpl.shops();
	}
	public void delwatch(String num){
		this.adminDaoImpl.delwatch(num);
	}
	public void addwatch(String num,String name,Double price,String img,String type) {
		watch watch=new watch();
		watch.setName(name);
		watch.setNum(num);
		watch.setPrice(price);
		watch.setImg(img);
		watch.setType(type);
		this.adminDaoImpl.addwatch(watch);
	}
	public void updatewatch(String num,Double p) {
		this.adminDaoImpl.update(num, p);
	}
	
}
