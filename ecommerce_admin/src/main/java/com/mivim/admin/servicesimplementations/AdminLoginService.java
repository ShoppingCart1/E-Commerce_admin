package com.mivim.admin.servicesimplementations;

import com.mivim.admin.daoimplementations.AdminLoginDao;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.servicesinterfaces.IAdminLoginService;

public class AdminLoginService implements IAdminLoginService{

	@Override
	public boolean getLoginService(AdminLoginDto adminLoginDto, AdminLoginDao adminLoginDao) {
		boolean loginCheck = adminLoginDao.getLoginDao(adminLoginDto);
		return loginCheck;
	}

}
