package com.gxun.task.mapper;

import com.gxun.task.entity.Admin;

public interface AdminMapper {
	Admin qryByAnameAndPwd(String adm_account, String adm_password);
}
