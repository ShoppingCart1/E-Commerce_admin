package com.mivim.admin.dao;

import java.util.List;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.admin.dto.CategoryDto;
import com.mivim.data.custom.model.Utils;
import com.mivim.data.model.Item;

public interface IAdminItemDao {
	public int addItem(AdminItemsDto dto);
	public int updateItem(AdminItemsDto dto);
	public int removeItem(AdminItemsDto dto);
	public Utils getItems(String id);
	public List<CategoryDto> getCategories();
	public List<CategoryDto> getSubCategories(CategoryDto dto);
	int setItemCategory(String categoryName, String subCategoryName, String itemId);
	public List<Item> getAllItems();
	int updateItemCategory(String categoryId, String subCategoryId, String itemId);

}
