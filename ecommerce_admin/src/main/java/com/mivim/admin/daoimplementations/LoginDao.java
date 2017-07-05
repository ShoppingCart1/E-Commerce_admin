package com.mivim.admin.daoimplementations;

import com.mivim.admin.dto.LoginDto;

public class LoginDao {

	public static boolean getLoginDao(LoginDto loginDto) {
		// TODO Auto-generated method stub
		String userName = loginDto.getUserName();
		String passWord = loginDto.getPassWord();
		
		if(userName.equals("tmmr")){
			return true;
		}		
		else{
			return false;
		}
	}



}
