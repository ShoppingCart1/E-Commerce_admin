package com.mivim.admin.service;

import com.mivim.admin.dto.RegisterUserDto;
import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminLoginService {
	
	public boolean authentication(AdminLoginDto dto);
	public boolean register(RegisterUserDto dto);

}
