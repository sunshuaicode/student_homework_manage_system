package com.gxun.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxun.task.service.ICourseService;
@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	ICourseService ics;
	@RequestMapping("/c_insert") 
	//插入课程信息
	public String insertCourseInfo(String c_no,String c_name,String c_class,String c_teacher){
		boolean result =ics.isInsertCourse(c_no, c_name, c_class, c_teacher);
		
		   if (result){
			 
			  return "add_lesson";
		   }
		   return "add_lesson";
	    
    }
	
	
	//查询所有课程信息
	@RequestMapping("/c_search") 
	@ResponseBody
	public String searchCourseInfo() {
		String json = ics.isSearchCourse();
		return json;		

	}
	
}
