package com.mivim.admin.dao;

import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminItemDao {
	
	public int authentication(AdminLoginDto dto);

}
