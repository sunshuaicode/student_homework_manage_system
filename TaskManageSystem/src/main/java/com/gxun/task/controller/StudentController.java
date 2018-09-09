package com.gxun.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.Text;
import com.gxun.task.service.StudentService;
@Controller
@RequestMapping("/stu")
public class StudentController {
	@Autowired StudentService studentService;
	@ResponseBody
	@RequestMapping("/select")
	public String select(String msg){		
	  List<Text> list = studentService.selectJob(msg);
	   return JSON.toJSONString(list);
	}
	@ResponseBody
	@RequestMapping("/selectscore")
	public String selectscore(String msg){		
		  List<Text> list = studentService.selectScore(msg);
		   return JSON.toJSONString(list);
		}
}
