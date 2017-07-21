package com.mivim.admin.dao;

import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminDao {
	public AdminLoginDto authentication(AdminLoginDto dto);
}
