package com.mivim.admin.daoImplementations;

import com.mivim.admin.dao.IAdminLoginDao;
import com.mivim.admin.dto.AdminLoginDto;

public class AdminLoginDao implements IAdminLoginDao {

	/*
	 * @see com.mivim.dao.UserDao#authentication(com.mivim.dto.UserDto)
	 * Here we wrote persistence logic
	 * @return Integer
	 * @param UserDto object
	 */
	@Override
	public int authentication(AdminLoginDto dto) {
		
		return 0;
	}

}
