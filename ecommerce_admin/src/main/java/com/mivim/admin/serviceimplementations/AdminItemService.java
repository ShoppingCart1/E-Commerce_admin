package com.mivim.admin.serviceimplementations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mivim.admin.dao.IAdminDao;
import com.mivim.admin.dao.IAdminItemDao;
import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.CategoryDto;
import com.mivim.admin.service.IAdminItemService;
import com.mivim.data.model.Item;

@Service
@Resource(name="adminItemService")
public class AdminItemService implements IAdminItemService{

	@Autowired(required = true)
	@Qualifier("adminItemDao")
	IAdminItemDao adminItemDao;	
	

	
	@Override
	public Map<String, String> getCategories() {
		Map<String, String> mapCategories = new HashMap<>();
		List<CategoryDto> categoryList = adminItemDao.getCategories();
		
		Iterator itr = categoryList.iterator();
		
		while(itr.hasNext()){
			CategoryDto dto = (CategoryDto) itr.next();
			mapCategories.put(dto.getId(), dto.getCategoryName());
		}
		
		return mapCategories;
		
	}
	
	@Override
	public Map<String, String> getSubCategoriesList(CategoryDto dto) {
		Map<String, String> mapSubCategories = new HashMap<>();
		List<CategoryDto> categoryList = adminItemDao.getSubCategories(dto);
		Iterator itr = categoryList.iterator();
		
		while(itr.hasNext()){
			CategoryDto categoryDto = (CategoryDto) itr.next();
			mapSubCategories.put(categoryDto.getId(), categoryDto.getCategoryName());
		}
		return mapSubCategories;

	}

	@Override
	public int addItem(AdminItemsDto dto) {
		int addItemCheck = adminItemDao.addItem(dto);
		return addItemCheck;
	}

	@Override
	public int updateItem(AdminItemsDto dto) {
		int updateItemCheck = adminItemDao.updateItem(dto);
		return updateItemCheck;
	}

	@Override
	public int removeItem(AdminItemsDto dto) {
		dto.setStatus(0);
		int removeStatusCheck = adminItemDao.removeItem(dto);
		return removeStatusCheck;
	}
}
