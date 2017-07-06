package com.mivim.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mivim.admin.daoimplementations.AdminLoginDao;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.servicesimplementations.AdminLoginService;

@Controller
public class AdminLoginController {
	

	
	@Autowired
	private AdminLoginService adminLoginService;
	private AdminLoginDao adminLoginDao;

	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView doLogin(){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(modelAndView);
		modelAndView.setViewName("/login_modules/login");
		return modelAndView;
	
	}
	
	
	@RequestMapping(value = "/loginCheck", method=RequestMethod.POST)
	public ModelAndView doLoginCheck(@ModelAttribute("adminLoginDto") AdminLoginDto adminLoginDto, HttpServletRequest request, HttpServletResponse response){
		
		ModelAndView modelAndView = new ModelAndView();

		boolean loginCheck = adminLoginService.getLoginService(adminLoginDto, adminLoginDao);
		
		if(loginCheck){
			modelAndView.setViewName("/login_modules/adminHome");
		}
		else{
			modelAndView.setViewName("/login_modules/adminFailure");
		}	
		
		return modelAndView;
		
	}
	
//	 @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
//	   public String redirect() {
//	      return "redirect: login.html";
//	   }
//	
//	
//	
}
