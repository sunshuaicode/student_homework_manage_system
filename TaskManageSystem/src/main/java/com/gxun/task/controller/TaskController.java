package com.gxun.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gxun.task.service.TaskService;

@Controller
@RequestMapping("/course")
public class TaskController {
	@Autowired
	TaskService cs;
	@RequestMapping("/addCourse")
	@ResponseBody
	public String addCourse(String courseName) {
		if(cs.addCourse(courseName)) {
			return "y";
		}
		return "n";
	}
	
	@RequestMapping("/judgeCourseExist")
	@ResponseBody
	public String judgeCourseExist(String courseName) {
		if(cs.isExist(courseName)) {
			return "y";
		}
		return "n";
	}
	
	@RequestMapping("/showCourse")
	@ResponseBody
	public String showCourse() {
		String j = cs.getCourses();
		return j;
	}
	
	@RequestMapping("/showClasss")
	@ResponseBody
	public String showClasss(){		
	  String json = cs.showClasss();
	   return json;
	}
	
	@RequestMapping("/delCourse")
	@ResponseBody
	public String delCourse(String cond) {
		boolean r = cs.delCourse(cond);
		System.out.println(cond);
		if(r) {
			return "ok";
		}
		return "ng";
	}
}
