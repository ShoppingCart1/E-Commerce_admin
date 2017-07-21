package com.mivim.admin.service;

import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminLoginService {
	
	public AdminLoginDto authentication(AdminLoginDto dto);
}
