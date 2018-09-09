package com.gxun.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gxun.task.entity.Student;
import com.gxun.task.entity.Teacher;
import com.gxun.task.mapper.StudentMapper;
import com.gxun.task.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	StudentMapper studentMapper;
	@Override
	//插入学生信息
	public boolean isInsertStudent(String stuNo, String stuPwd, String stuName, String stuCollege, String stuClass) {
		Student s = studentMapper.insertStuInfo(stuNo, stuPwd, stuName, stuCollege, stuClass);
		if (s!=null){
			return true;
		}
		return false;
	}

	//查询学生信息
	public String isSearchStudent() {
		List<Student> s=studentMapper.searchStuInfo();
    	String json=JSON.toJSONString(s);
    	return json;
	}
	
}
