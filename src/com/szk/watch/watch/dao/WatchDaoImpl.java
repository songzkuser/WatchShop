package com.szk.watch.watch.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.loader.custom.Return;
import org.hibernate.procedure.internal.Util.ResultClassesResolutionContext;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.watch;


@Repository
public class WatchDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public List<watch> queryForPage(int offset,int length) {
	       //查询所有的记录数
	       Query query= (Query) sessionFactory.getCurrentSession().createQuery("from watch");    
	        query.setFirstResult(offset);
	        query.setMaxResults(length);            
	        return query.list(); 
	}
	//查询记录总数
	public int getAllRowCount(){
	    int count=((Long) sessionFactory.getCurrentSession().createQuery( "select count(*) from watch").iterate().next()).intValue();
	    return count;  
	}

	
	
	public List<watch> findbyname(String name){
		String hql = "from watch w where w.name like '%"+name+"%'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<watch> userList = query.list();
		return query.list();
	}
	public List<watch> findbytype(String type){
		Query query= (Query) sessionFactory.getCurrentSession().createQuery("from watch w where w.type='"+type+"'");
		return query.list();
	}
	
	public List<watch> findbynum(String name){
		String hql = "from watch w where w.num='"+name+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<watch> userList = query.list();
		return query.list();
		
	}
	
	public watch findbyid(Integer id){
		String hql = "from watch w where w.id='"+id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		watch watch = (watch)query.uniqueResult();
		return watch;
		
	}
	
	public List<watch> selects(int offset,int length,String name) {
		List<watch> list1=this.findbyname(name);
		List<watch> list2=this.findbynum(name);
		Set<watch> set=new HashSet<watch>();
		set.addAll(list1);
		set.addAll(list2);
		List<watch> list=new ArrayList<watch>();		
		list.addAll(set);
		List<watch> watchlist=new ArrayList<watch>();
		for(int i=offset;i<offset+length;i++) {
			if(i<list.size()) {
			watchlist.add(list.get(i));
			}
		}
		this.setAllRowCount0(list.size());
		return watchlist;
	}
	public List<watch> especialselect(int offset,int length,String type){
		List<watch> list=this.findbytype(type);
		List<watch> watchlist=new ArrayList<watch>();
		for(int i=offset;i<offset+length;i++) {
			if(i<list.size()) {
			watchlist.add(list.get(i));
			}
		}
		this.setAllRowCount0(list.size());
		return watchlist;	
	}
	
	//返回查询结果总数
	private int setAllRowCount0(int count) {
		return count;
	}
}