package com.mivim.admin.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.CategoryDto;

public interface IAdminItemService {
	public Map<String, String> getCategories();
	public Map<String, String> getSubCategoriesList(CategoryDto dto);
	public int addItem(AdminItemsDto dto);
	public int updateItem(AdminItemsDto dto);
	public int removeItem(AdminItemsDto dto);
}
