package com.gxun.task.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.Student;
import com.gxun.task.entity.Teacher;
import com.gxun.task.entity.Text;
import com.gxun.task.mapper.UserMapper;
import com.gxun.task.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public boolean isValidUser(String account, String pwd) {
		Student u = userMapper.qryByUnameAndPwd(account, pwd);
		if (null!=u){
			return true;
		}
		return false;
	}
	@Override
	public boolean isValidteacher(String account, String pwd) {
		Teacher u = userMapper.qryTeacher(account, pwd);
		if (null!=u){
			return true;
		}
		
		return false;
	}
	@Override
	public boolean insertTask(String tid, String taskName,  String start, String end, String context,
			String cName, String cla) {
		Date d=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String now=f.format(d);
		int i=userMapper.insertTask(tid, taskName, now, start, end, context, cName, cla);
		if(i>=1) {
			return true;
		}
		return false;
	}
	@Override
	public String getTask(String taskName) {
		Text task = userMapper.getTask(taskName);
		return JSON.toJSONString(task);
	}
	@Override
	public boolean upTask(String taskName, String task) {
		int r = userMapper.upTask(taskName,task);
		if(r>=1) {
			return true;
		}
		return false;
	}
	

}
