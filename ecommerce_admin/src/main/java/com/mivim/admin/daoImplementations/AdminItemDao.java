package com.mivim.admin.daoImplementations;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mivim.admin.dao.IAdminDao;
import com.mivim.admin.dao.IAdminItemDao;
import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.CategoryDto;
import com.mivim.data.dao.CategoryMapper;
import com.mivim.data.dao.ItemMapper;
import com.mivim.data.model.Category;
import com.mivim.data.model.CategoryExample;
import com.mivim.data.model.Item;
import com.mivim.data.model.ItemExample;

@Repository
@Resource(name="adminItemDao")
public class AdminItemDao implements IAdminItemDao{
	
	@Autowired(required = true)
	@Qualifier("sqlSession")
	
	SqlSessionTemplate sqlSession;
	
	@Autowired
	private ItemMapper itemMapper;
	
	@Autowired(required = true)
	@Qualifier("item")
	Item item;
	
	@Autowired(required = true)
	@Qualifier("itemExample")
	ItemExample itemExample;
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired(required = true)
	@Qualifier("category")
	Category category;
	
	@Autowired(required = true)
	@Qualifier("categoryExample")
	CategoryExample categoryExample;
	
	@Override
	public int addItem(AdminItemsDto dto) {
		
		//Item item = new Item();
		System.out.println("item"+item);
		item.setItemName(dto.getItemName());
		item.setInventary(dto.getItemInventry());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		item.setId(getUserId());
		
		int status = itemMapper.insert(item);
		System.out.println("successfully added..");
		return status;
	}
	
	@Override
	public int updateItem(AdminItemsDto dto) {
		
		item.setItemName(dto.getItemName());
		item.setInventary(dto.getItemInventry());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		item.setId(dto.getId());
		
		int status = itemMapper.updateByPrimaryKey(item);
		return status;
	}
	
	@Override
	public int removeItem(AdminItemsDto dto) {
		
		item.setId(dto.getId());
		item.setStatus(dto.getStatus());
		int removeItemStatus = itemMapper.updateByPrimaryKeySelective(item);
		return removeItemStatus;
	
	}
	
	
	@Override
	public List<AdminItemsDto> getItems() {
		
		List<AdminItemsDto> newList = new ArrayList<AdminItemsDto>();

		itemExample.setDistinct(true);
		itemExample.or().andStatusEqualTo(1);
		List<Item> list = itemMapper.selectByExample(itemExample);

		for (Item item : list) {
			AdminItemsDto adminItemsDto = new AdminItemsDto();
			adminItemsDto.setId(item.getId());
			adminItemsDto.setItemName(item.getItemName());
			adminItemsDto.setItemDescription(item.getItemDescription());
			adminItemsDto.setUnitPrice(item.getUnitPrice());
			adminItemsDto.setItemInventry(item.getInventary());
			adminItemsDto.setUpdatedDate(item.getUpdatedDate());
			newList.add(adminItemsDto);

		}

		return newList;
	}
	
	@Override
	public List<CategoryDto> getCategories() {
		List<CategoryDto> categoryList = new ArrayList<CategoryDto>();

		categoryExample.setDistinct(true);
		categoryExample.or().andParentIdEqualTo("0");
		List<Category> list = categoryMapper.selectByExample(categoryExample);

		for (Category category : list) {
			CategoryDto categoryDto = new CategoryDto();
			
			categoryDto.setCategoryName(category.getCategoryName());
			categoryDto.setId(category.getId());
			categoryDto.setParentId(category.getParentId());
			
			categoryList.add(categoryDto);

		}
		categoryExample.clear();
		return categoryList;
	}
	
	@Override
	public List<CategoryDto> getSubCategories(CategoryDto dto) {
		
		List<CategoryDto> subCategoriesList = new ArrayList<CategoryDto>();

		//categoryExample.setDistinct(true);
		categoryExample.or().andParentIdEqualTo(dto.getId());
		List<Category> list = categoryMapper.selectByExample(categoryExample);

		for (Category subCategory : list) {
			CategoryDto subCategoryDto = new CategoryDto();
			subCategoryDto.setCategoryName(subCategory.getCategoryName());
			subCategoryDto.setId(subCategory.getId());
			subCategoryDto.setParentId(subCategory.getParentId());
			
			subCategoriesList.add(subCategoryDto);

		}
		categoryExample.clear();
		return subCategoriesList;	
	}


	
	
	
	public static Date getDate()
	{
		return new java.sql.Date(Calendar.getInstance().getTimeInMillis());
		
	}
	
	
	
	public static String getUserId()
	{
		return UUID.randomUUID().toString();
	}
	
	
	public static int getStatusCode()
	{
		return 1;
	}

	
	
	



}
