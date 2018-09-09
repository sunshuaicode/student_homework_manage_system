package com.gxun.task.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxun.task.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService usvr;
	@RequestMapping("/lg") 
	public String login(String account, String pwd,HttpServletRequest reqest){
		boolean result = usvr.isValidUser(account, pwd);
		if (result){
			reqest.getSession().setAttribute("account", account);
			return "student_homepage";
		}
		return "ng";
	}
	@RequestMapping("/tealogin") 
	public String tealogin(String account, String pwd,HttpServletRequest reqest){
		boolean result = usvr.isValidteacher(account, pwd);
		if (result){
			reqest.getSession().setAttribute("techer_sno", account);
			return "teacher_index";
		}
		return "ng";
	}
	@RequestMapping("/getSession") 
	@ResponseBody
	  public String getSession(String sessionName, HttpServletRequest request) {

	        if (request.getSession().getAttribute(sessionName) == null) {
	            return "ng";
	        }
	        return request.getSession().getAttribute(sessionName).toString();
	    }
	
	@RequestMapping("/addTask") 
	@ResponseBody
	  public String addTask(String tid, String taskName,String start, String end, String context,
				String cName, String cla) {

	        boolean i=usvr.insertTask(tid, taskName, start, end, context, cName, cla);
	        if(i) {
	        	return "ok";
	        }
	        return "ng";
	    }
	@RequestMapping("/getTask")
	@ResponseBody
	public String getTask(String taskName) {
		String json = usvr.getTask(taskName);
		return json;
	}
	
	@RequestMapping("/upTask")
	@ResponseBody
	public String upTask(String taskName,String task) {
		boolean r = usvr.upTask(taskName,task);
		if(r) {
			return "ok";
		}
		return "ng";
	}
}
