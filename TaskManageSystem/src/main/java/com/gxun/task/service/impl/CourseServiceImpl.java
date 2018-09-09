package com.gxun.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.Course;
import com.gxun.task.entity.CourseTask;
import com.gxun.task.entity.Teacher;
import com.gxun.task.mapper.CourseMapper;
import com.gxun.task.mapper.TaskMapper;
import com.gxun.task.service.ICourseService;
@Service
public class CourseServiceImpl implements ICourseService{
	@Autowired
	CourseMapper courseMapper;
	//插入课程信息
	@Override
	public boolean isInsertCourse(String c_no,String c_name,String c_class,String c_teacher){
		Course c = courseMapper.insertCourseInfo(c_no, c_name, c_class, c_teacher);
		if (c!=null){
			return true;
		}
		return false;
	}
	
	//查询所有课程信息

    public String isSearchCourse() {
    	List<Course> c=courseMapper.searchCourseInfo();
    	String json=JSON.toJSONString(c);
    	return json;
    }
}
