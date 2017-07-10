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
import com.mivim.admin.service.IAddItemCategoryService;

@Controller
public class AddItemCategoryController {
	
	
	@Autowired(required = true)
	@Qualifier("addItemCategoryService")
	IAddItemCategoryService iAddItemCategoryService;
	
	
	@RequestMapping(value="/getCategories", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody Map<Integer, String> getCategory(){
		Map<Integer, String> categoryList = iAddItemCategoryService.getCategories(); 
		System.out.println(categoryList);
		return categoryList;
	}
	
	@RequestMapping(value="/getSubCategories", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public @ResponseBody Map<String, String> getSubCategories(CategoryDto dto){
		System.out.println("Entered into url");
		Map<String, String> subCategories = iAddItemCategoryService.getSubCategoriesList(dto); 
		System.out.println(subCategories);
		return subCategories;
	}
	@RequestMapping(value="/addItem", method=RequestMethod.GET)
	public int addItem(@RequestParam Map<String, String> addItemParamList){
		int addItemCheck = iAddItemCategoryService.addItem(addItemParamList); 
		if(addItemCheck==1)
		System.out.println("successful");
		else
		System.out.println("failure");
		return addItemCheck;
	}
	
	
}