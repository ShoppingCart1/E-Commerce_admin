package com.mivim.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.service.IAdminLoginService;

@Controller
public class AdminLoginController {

	@Autowired(required = true)
	@Qualifier("adminLoginService")
	IAdminLoginService adminLoginService;
	
	
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, Object> getAuthentication(HttpServletRequest request, AdminLoginDto dto) {

		Map<String, Object> map = new HashMap<String, Object>();
		AdminLoginDto adminLoginDto = adminLoginService.authentication(dto);

		HttpSession session = request.getSession();
		session.setAttribute("adminLoginDto", adminLoginDto);
		AdminLoginDto admin = (AdminLoginDto) session.getAttribute("adminLoginDto");
		if (admin != null) {
			map.put("status", "200");
			map.put("message", admin);
		} else {
			map.put("status", "400");
			map.put("message", admin);
		}

		return map;

	}
	
	@RequestMapping(value = "/getUserData", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, Object> getUserData(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = request.getSession();
		
		AdminLoginDto adminLoginDto = (AdminLoginDto) session.getAttribute("adminLoginDto");
		if (adminLoginDto != null){
		map.put("status", "200");
		map.put("message", adminLoginDto);
		}
		else {
			map.put("status", "400");
			map.put("message", adminLoginDto);
			
		}
		return map;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody Map<String,Object> getLogout(HttpServletRequest request)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		HttpSession session = request.getSession();
		session.invalidate();
		
		map.put("status", "200");
		map.put("message", "You are loggedout Successfully");
		
		return map;
		
	}
	

}
