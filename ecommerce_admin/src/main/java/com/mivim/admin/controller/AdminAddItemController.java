package com.mivim.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mivim.admin.daoimplementations.AdminAddItemDao;
import com.mivim.admin.dto.AdminAddItemDto;
import com.mivim.admin.servicesimplementations.AdminAddItemService;

@Controller
public class AdminAddItemController {
	@Autowired
	private AdminAddItemService adminAddItemService;
	private AdminAddItemDao adminAddItemDao;
	
	@RequestMapping(value = "/addItemAdmin", method = RequestMethod.GET)
	public ModelAndView addItem(ModelAndView modelAndView, @ModelAttribute("adminAddItemDto") AdminAddItemDto adminAddItemDto){
		
		int addItem = adminAddItemService.getAddItemService(adminAddItemDto, adminAddItemDao);
		
		System.out.println("Test "+addItem);
		return modelAndView;
		
		
	}
}
