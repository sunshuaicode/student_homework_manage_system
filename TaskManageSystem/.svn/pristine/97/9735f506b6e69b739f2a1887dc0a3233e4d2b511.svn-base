package com.gxun.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxun.task.service.ITeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherInfoController {
	@Autowired
	ITeacherService its;
	@RequestMapping("/t_insert") 
	//插入教师信息
	public String insertTeacherInfo(String t_no,String t_password,String t_name,String t_phonenum,String t_college){
		boolean result =its.isInsertTeacher(t_no, t_password, t_name, t_phonenum, t_college);
		
		   if (result){
			 
			  return "add_teacher";
		   }
		   return "add_teacher";
	    
    }
	//查询所有教师信息
	@RequestMapping("/t_search") 
	@ResponseBody
	public String searchTeacherInfo() {
		String json = its.isSearchTeacher();
		return json;		

	}
}
