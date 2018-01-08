package com.szk.watch.watch.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.util.HashSetOfInt;
import org.hibernate.Session;
import org.hibernate.sql.Select;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.szk.watch.entity.User;
import com.szk.watch.entity.page;
import com.szk.watch.entity.watch;
import com.szk.watch.watch.service.WatchServiceImpl;

import javassist.expr.NewArray;

@Controller
@RequestMapping("watch")
public class WatchControllerImpl {

	@Resource
	private WatchServiceImpl watchServiceImpl;
	
	@RequestMapping("/list")
	//找到所有的记录并实现了分页
	public String findAll(HttpServletRequest request,HttpServletResponse response,Model model) {   
	        String pageNo = request.getParameter("pageNo");
	        if (pageNo == null) {
	            pageNo = "1";
	        }
	        page page = watchServiceImpl.queryForPage(Integer.valueOf(pageNo), 4);
	        request.setAttribute("page", page);
	        List<watch> list = page.getList();
	        model.addAttribute("list", list);
	    return "shopfront";
	}
	
	@RequestMapping("/selects")
	public String selects(HttpServletRequest request,HttpServletResponse response,
							@RequestParam("name") String name,Model model) {   
	        String pageNo = request.getParameter("pageNo");
	        if (pageNo == null) {
	            pageNo = "1";
	        }
	        page page = watchServiceImpl.selects(Integer.valueOf(pageNo), 4, name);
	        request.setAttribute("page", page);
	        List<watch> list = page.getList();
	        model.addAttribute("list", list);
	    return "shopfront";
	}
	@RequestMapping("selectbytype")
	public String Selectbytype(HttpServletRequest request,HttpServletResponse response,
							@RequestParam("type") String type,Model model) {
		String pageNo = request.getParameter("pageNo");
        if (pageNo == null) {
            pageNo = "1";
        }
        page page = watchServiceImpl.selecttype(Integer.valueOf(pageNo), 4, type);
        request.setAttribute("page", page);
        List<watch> list = page.getList();
        model.addAttribute("list", list);
		return "shopfront";
	}
	
	@RequestMapping("/details")
	public String showgoods(@RequestParam("id") Integer id,Model model){
		watch watch=watchServiceImpl.findbyid(id);
		model.addAttribute("watch", watch);
		return "showgoods";
		
	}
	
	@RequestMapping("/addtobag")
	public String addtobag(@RequestParam("id") Integer id,HttpSession session,HttpServletRequest request,Model model){
		watch watch=watchServiceImpl.findbyid(id);
		if(session.getAttribute("lists")==null) {
			List<watch> lists=new ArrayList<watch>();
			lists.add(watch);
			session.setAttribute("lists", lists);
			model.addAttribute("a", lists);
		}else {
			List<watch> lists=(List<com.szk.watch.entity.watch>) session.getAttribute("lists");
			lists.add(watch);
			for (int i = 0; i < lists.size()-1; i++) {
					for (int j = lists.size()-1; j >i;j--) {
						if(lists.get(i).getId()==lists.get(j).getId()){
							lists.remove(j);
						}
					}
			}
			session.setAttribute("lists", lists);
			request.setAttribute("size", lists.size());
			model.addAttribute("a", lists);
		}
		return "shopbag";
	}
	
	@RequestMapping("/delectfrombag")
	public String delectfrombag(@RequestParam("id") Integer id,HttpSession session,HttpServletRequest request,Model model) {
		List<watch> lists=(List<com.szk.watch.entity.watch>) session.getAttribute("lists");
		for (int i = 0; i < lists.size(); i++) {
			if(lists.get(i).getId()==id){
				lists.remove(i);
			}
		}
		session.setAttribute("lists", lists);
		request.setAttribute("size", lists.size());
		model.addAttribute("a", lists);
		
		return "shopbag";
	}
}
