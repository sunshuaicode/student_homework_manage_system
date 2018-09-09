package com.gxun.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.CourseTask;
import com.gxun.task.mapper.TaskMapper;
import com.gxun.task.service.TaskService;
@Service
@Transactional
public class TaskServiceImpl implements TaskService{
	@Autowired
	TaskMapper cm;
	@Override
	public boolean addCourse(String courseName) {
		int i = cm.addOneCourse(courseName);
		if(i>=1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isExist(String courseName) {
		CourseTask course =cm.qryCourseByName(courseName);
		if(null!=course) {
			return true;
		}
		return false;
	}
	@Override
	public String getCourses() {
		List<CourseTask> list = cm.qryCourses();
		return JSON.toJSONString(list);
	}
	@Override
	public String showClasss() {
		List<String> list = cm.showClasss();
		return JSON.toJSONString(list);
	}
	@Override
	public boolean delCourse(String cond) {
		int i = cm.delCourse(cond);
		if(i>=1) {
			return true;
		}
		return false;
	}
	

}
