package com.gxun.task.service;

public interface ITeacherService {
	boolean isInsertTeacher(String t_no,String t_password,String t_name,String t_phonenum,String t_college);
	String isSearchTeacher();
}
