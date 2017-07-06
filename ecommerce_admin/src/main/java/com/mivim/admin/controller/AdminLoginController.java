package com.mivim.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mivim.admin.dto.LoginDto;
import com.mivim.admin.servicesimplementations.LoginService;

@Controller
public class AdminLoginController {
	

	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView doLogin(){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(modelAndView);
		modelAndView.setViewName("login_modules/login");

		return modelAndView;
	}
	
	@RequestMapping(value = "/loginCheck", method=RequestMethod.POST)
	public ModelAndView doLoginCheck(@ModelAttribute("loginDto") LoginDto loginDto){
		
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("Test "+loginDto.getUserName()+"  "+loginDto.getPassWord());
		boolean loginCheck = loginService.getLoginService(loginDto);
		
		if(loginCheck == true){
			modelAndView.setViewName("login_modules/adminHome");
		}
		
		else{
			modelAndView.setViewName("login_modules/adminFailure");
		}
		
		return modelAndView;

		
	}
	
	
	
}
