package com.mivim.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.CategoryDto;
import com.mivim.admin.service.IAdminItemService;

@Controller
public class AdminItemController {

	@Autowired(required = true)
	@Qualifier("adminItemService")
	IAdminItemService iAdminItemService;

	@RequestMapping(value = "/addItem", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<String> addItem(AdminItemsDto dto) {

		int addItemCheck = iAdminItemService.addItem(dto);
		List<String> list = new ArrayList<String>();

		if (addItemCheck != 0)
			list.add("Added successfully");
		else
			list.add("Adding failure");
		System.out.println(list);
		return list;
	}

	@RequestMapping(value = "/updateItem", method = RequestMethod.GET)
	public @ResponseBody List<String> updateItem(AdminItemsDto dto) {

		String result = null;
		List<String> list = new ArrayList<String>();

		int updateItemCheck = iAdminItemService.updateItem(dto);

		if (updateItemCheck == 1)
			list.add("Updated successfully");
		else
			list.add("Updation failure");
		return list;

	}

	@RequestMapping(value = "/removeItem", method = RequestMethod.GET)
	public @ResponseBody List removeItem(AdminItemsDto dto) {
		List<String> list = new ArrayList<String>();

		int removeStatus = iAdminItemService.removeItem(dto);

		if (removeStatus == 1)
			list.add("Removed successfully");

		else
			list.add("Unable to remove");
		
		return list;
	}

	@RequestMapping(value = "/getCategories", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, String> getCategory() {
		Map<String, String> categoryList = iAdminItemService.getCategories();
		return categoryList;
	}

	@RequestMapping(value = "/getSubCategories", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<String, String> getSubCategories(CategoryDto dto) {
		Map<String, String> subCategories = iAdminItemService.getSubCategoriesList(dto);
		return subCategories;
	}

}