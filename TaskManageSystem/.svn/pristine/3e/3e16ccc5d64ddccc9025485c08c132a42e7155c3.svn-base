package com.gxun.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gxun.task.service.IAdminService;
@Controller
@RequestMapping("/view")
public class AdminController {
	@Autowired
	IAdminService ias;
	@RequestMapping("/a_login") 
	public String login(String adm_account, String adm_password){
		boolean result = ias.isValidUser(adm_account, adm_password);
		if (result){
			return "admin_home_page";
		}
		return "admin_login";
	}
}
