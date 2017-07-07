package com.mivim.admin.dao;

import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminLoginDao {
	
	public int authentication(AdminLoginDto dto);

}
