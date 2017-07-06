package com.mivim.admin.servicesinterfaces;

import com.mivim.admin.daoimplementations.AdminLoginDao;
import com.mivim.admin.dto.AdminLoginDto;

public interface IAdminLoginService {
	public boolean getLoginService(AdminLoginDto loginDto, AdminLoginDao adminLoginDao);

}
