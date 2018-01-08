package com.szk.watch.watch.service;

import java.util.List;
import javax.annotation.Resource;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szk.watch.entity.page;
import com.szk.watch.entity.watch;
import com.szk.watch.watch.dao.WatchDaoImpl;


@Service
@Transactional(readOnly=true)
public class WatchServiceImpl {

	@Resource
	private WatchDaoImpl watchDaoImpl;
	
	public page selects(int currentPage,int pageSize,String name){
		 page page = new page();       
	        //当前页开始记录
	     int offset =page.countOffset(currentPage, pageSize);  
	        //分页查询结果集
		 List<watch> list=this.watchDaoImpl.selects(offset,pageSize,name);
		 int allRow =list.size();
		 page.setPageNo(currentPage);
		 page.setPageSize(pageSize);
		 page.setTotalRecords(allRow);
		 page.setList(list);
		 return page;
	}
	public page selecttype(int currentPage,int pageSize,String type){
		 page page = new page();       
	        //当前页开始记录
	     int offset =page.countOffset(currentPage, pageSize);  
	        //分页查询结果集
		 List<watch> list=this.watchDaoImpl.especialselect(offset, pageSize, type);
		 int allRow =list.size();
		 page.setPageNo(currentPage);
		 page.setPageSize(pageSize);
		 page.setTotalRecords(allRow);
		 page.setList(list);
		 return page;
	}
	
	public List<watch> findbyname(String name){
		return this.watchDaoImpl.findbyname(name);
	}
	public List<watch> findbynum(String id){
		return this.watchDaoImpl.findbynum(id);
	}
	public watch findbyid(Integer id){
		return this.watchDaoImpl.findbyid(id);
	}
	
	public page queryForPage(int currentPage,int pageSize) {
        page page = new page();       
        //总记录数
        int allRow =watchDaoImpl.getAllRowCount();
        //当前页开始记录
        int offset =page.countOffset(currentPage, pageSize);  
        //分页查询结果集
        List<watch> list = watchDaoImpl.queryForPage(offset,pageSize); 
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);    
        return page;
    }
	
}
