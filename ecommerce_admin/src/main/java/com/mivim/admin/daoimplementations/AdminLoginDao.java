package com.mivim.admin.daoimplementations;

import com.mivim.admin.daointerfaces.IAdminLoginDao;
import com.mivim.admin.dto.AdminLoginDto;

public class AdminLoginDao implements IAdminLoginDao{
	
	@Override
	public boolean getLoginDao(AdminLoginDto adminLoginDto) {
		// TODO Auto-generated method stub
		String userName = adminLoginDto.getUserName();
		String passWord = adminLoginDto.getPassWord();
		
		if(userName.equals("tmmr")){
			return true;
		}		
		else{
			return false;
		}
	}

	



}
