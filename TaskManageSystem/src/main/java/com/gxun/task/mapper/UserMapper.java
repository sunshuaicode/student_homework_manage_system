package com.gxun.task.mapper;

import java.util.List;

import org.springframework.scheduling.config.Task;

import com.gxun.task.entity.Student;
import com.gxun.task.entity.Teacher;
import com.gxun.task.entity.Text;

public interface UserMapper {
	Student qryByUnameAndPwd(String account, String pwd);
	Teacher qryTeacher(String account, String pwd);
	List<Text> selectText(String msg);
	List<Text> selectScore(String msg);
	int insertTask(String tid,String taskName,String now,String start,String end,
			String context,String cName,String cla);
	Text getTask(String taskName);
	int upTask(String taskName, String task);
}
