package com.mivim.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.AdminUtilDto;
import com.mivim.admin.service.IAdminUtilService;


@Controller
public class AdminUtilController {

	@Autowired(required=true)
	@Qualifier("adminUtilService")
	IAdminUtilService adminUtilService;
	
	@RequestMapping(value="/getItemsData",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody List<AdminItemsDto> getItemsData()
	{
		List<AdminItemsDto> items=adminUtilService.getItemDetails();
		
		return items;
	}
	
	@RequestMapping(value="/getItemDataById",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody List<AdminItemsDto> getItemData(AdminUtilDto dto)
	{
		
		List<AdminItemsDto> item=adminUtilService.getItemView(dto);

		
		return item;
		
	}
}