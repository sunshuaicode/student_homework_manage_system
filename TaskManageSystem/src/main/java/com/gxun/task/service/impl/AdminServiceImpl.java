package com.gxun.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxun.task.entity.Admin;
import com.gxun.task.mapper.AdminMapper;
import com.gxun.task.service.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	AdminMapper adminMapper;
	@Override
	public boolean isValidUser(String adm_account, String adm_password) {
		Admin u = adminMapper.qryByAnameAndPwd(adm_account, adm_password);
		if (null!=u){
			return true;
		}
		return false;
	}
	
}
