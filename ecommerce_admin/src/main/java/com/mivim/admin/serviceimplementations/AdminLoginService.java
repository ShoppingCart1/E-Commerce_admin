package com.mivim.admin.serviceimplementations;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.service.IAdminLoginService;

@Service
@Resource(name="adminLoginService")
public class AdminLoginService implements IAdminLoginService {

//	@Autowired
//	UserDao userDao;
	
	/*
	 * @author SReddy
	 * @see com.mivim.service.UserService#authentication(com.mivim.dto.UserDto)
	 * @return boolean
	 * @param UserDto object
	 */
	public boolean authentication(AdminLoginDto dto) {
	
		return true;
	}



}