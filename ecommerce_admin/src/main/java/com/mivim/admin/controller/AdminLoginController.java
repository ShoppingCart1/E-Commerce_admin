package com.mivim.admin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.dto.RegisterUserDto;
import com.mivim.admin.service.IAdminLoginService;

@Controller
public class AdminLoginController {

	@Autowired(required = true)
	@Qualifier("adminLoginService")
	IAdminLoginService adminLoginService;
	
	/*
	 * @author SReddy This method is for userAuthentication
	 * 
	 * @return Map
	 * 
	 * @param UserDto object
	 */
	/*@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLogin()
	{
		return new ModelAndView("login");
	}
	*/
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, Object> getAuthentication(AdminLoginDto dto, @RequestParam("email") String email) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (adminLoginService.authentication(dto)) {
			map.put("status", "200");
			map.put("message", "Your login is Successful");
		} else {
			map.put("status", "400");
			map.put("message", "Your login failed");
		}
		System.out.println("Test user name "+email);
		return map;

	}

	

}
