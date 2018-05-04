package com.oracle.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.service.ClassService;
import com.oracle.vo.TbClass;

@Controller
@RequestMapping("/class")
public class ClassHandler {
	@Autowired
	ClassService classService;
	
	//通过路径转化解决jsp不能直接访问问题
	@RequestMapping("/{path}")
	public String path(@PathVariable("path")String path){
		return "class/"+path;
	}
    
	
	@RequestMapping("/save")
	public String save(TbClass tbClass){
		System.out.println("这是要插入的班级信息："+tbClass);
		classService.save(tbClass);
		return "redirect:getAll/1";
	}
	
	@RequestMapping("/getAll/{page}")
	public String getAll(@PathVariable("page") int page,Map<String,Object> map){
		//分页插件pagehelper
		PageHelper.startPage(page,10);
		PageInfo<Map<String,Object>> info=new PageInfo<Map<String,Object>>(classService.selectAll());
		map.put("info", info);
		return "class/listClass";
	}
}
