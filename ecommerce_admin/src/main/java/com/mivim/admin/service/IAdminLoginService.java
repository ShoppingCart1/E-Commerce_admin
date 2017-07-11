package com.mivim.admin.service;

import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminLoginService {
	
	public boolean authentication(AdminLoginDto dto);

}
