package com.gxun.task.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.Teacher;
import com.gxun.task.mapper.TeacherMapper;
import com.gxun.task.service.ITeacherService;
@Service
public class TeacherServiceImpl implements ITeacherService{
	@Autowired
	TeacherMapper teacherMapper;
	@Override
	//插入教师信息
	public boolean isInsertTeacher(String t_no,String t_password,String t_name,String t_phonenum,String t_college){
		Teacher t = teacherMapper.insertTeaInfo(t_no, t_password, t_name, t_phonenum, t_college);
		if (t!=null){
			return true;
		}
		return false;
	}
	//查询所有教师信息

    public String isSearchTeacher() {
    	List<Teacher> t=teacherMapper.searchTeaInfo();
    	String json=JSON.toJSONString(t);
    	return json;
    }
}
