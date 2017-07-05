package com.mivim.admin.servicesimplementations;

import com.mivim.admin.daoimplementations.LoginDao;
import com.mivim.admin.dto.LoginDto;
import com.mivim.admin.servicesinterfaces.ILoginService;

public class LoginService implements ILoginService{

	@Override
	public boolean getLoginService(LoginDto loginDto) {
		boolean loginCheck = LoginDao.getLoginDao(loginDto);
		return loginCheck;
	}

//	public boolean getLoginService(LoginDto loginDto) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
