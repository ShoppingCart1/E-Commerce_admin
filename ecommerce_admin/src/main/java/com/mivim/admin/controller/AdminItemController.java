package com.mivim.admin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.CategoryDto;
import com.mivim.admin.service.IAdminItemService;

@Controller
public class AdminItemController {
	
	
	@Autowired(required = true)
	@Qualifier("adminItemService")
	IAdminItemService iAdminItemService;

	
	@RequestMapping(value="/addItem", method=RequestMethod.GET)
	public int addItem(@RequestParam Map<String, String> addItemParamList){
		int addItemCheck = iAdminItemService.addItem(addItemParamList); 
		if(addItemCheck==1)
		System.out.println("successful");
		else
		System.out.println("failure");
		return addItemCheck;
	}
	
	@RequestMapping(value="/updateItem", method=RequestMethod.GET)
	public int updateItem(@RequestParam Map<String, String> updateItemParamList){
		int updateItemCheck = iAdminItemService.updateItem(updateItemParamList); 
		if(updateItemCheck==1)
		System.out.println("successful");
		else
		System.out.println("failure");
		return updateItemCheck;
	}
	
	@RequestMapping(value="/removeItem", method=RequestMethod.GET)
	public int removeItem(@RequestParam("itemId") String itemId){
		int removeStatus = iAdminItemService.removeItem(itemId); 
		if(removeStatus==1)
		System.out.println("successful");
		else
		System.out.println("failure");
		return removeStatus;
	}

	@RequestMapping(value="/getCategories", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody Map<Integer, String> getCategory(){
		Map<Integer, String> categoryList = iAdminItemService.getCategories(); 
		System.out.println(categoryList);
		return categoryList;
	}
	
	
	@RequestMapping(value="/getSubCategories", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody Map<String, String> getSubCategories(CategoryDto dto){
		System.out.println("Entered into url");
		Map<String, String> subCategories = iAdminItemService.getSubCategoriesList(dto); 
		System.out.println(subCategories);
		return subCategories;
	}
	
}