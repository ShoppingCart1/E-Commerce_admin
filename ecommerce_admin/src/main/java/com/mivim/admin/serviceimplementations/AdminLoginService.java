package com.mivim.admin.serviceimplementations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mivim.admin.dao.IAdminDao;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.service.IAdminLoginService;

@Service
@Resource(name="adminLoginService")
public class AdminLoginService implements IAdminLoginService {

	@Autowired
	@Qualifier("adminDao")
	IAdminDao iadminDao;
	
	
	public AdminLoginDto authentication(AdminLoginDto dto) {

		AdminLoginDto adminLoginDto = iadminDao.authentication(dto);

		return adminLoginDto;
	}



}