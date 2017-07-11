package com.mivim.admin.service;

import java.util.Map;

import com.mivim.admin.dto.CategoryDto;

public interface IAdminItemService {
	public Map<Integer, String> getCategories();
	public Map<String, String> getSubCategoriesList(CategoryDto dto);
	public int addItem(Map<String, String>addItemParamList);
	public int updateItem(Map<String, String> updateItemParamList);
	public int removeItem(String itemId);
}
