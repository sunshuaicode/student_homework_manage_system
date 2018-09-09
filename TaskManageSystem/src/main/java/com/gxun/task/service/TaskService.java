package com.gxun.task.service;

import java.util.List;

public interface TaskService {
	//添加课程
	public boolean addCourse(String courseName);
	//判断课程是否存在
	public boolean isExist(String courseName);
	public String getCourses();
	public String showClasss();
	public boolean delCourse(String cond);
}
