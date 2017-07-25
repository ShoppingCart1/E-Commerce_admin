package com.mivim.admin.daoImplementations;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mivim.admin.dao.IAdminItemDao;
import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.CategoryDto;
import com.mivim.data.custom.dao.CustomUtilsMapper;
import com.mivim.data.custom.model.Utils;
import com.mivim.data.dao.CategoryMapper;
import com.mivim.data.dao.ItemMapper;
import com.mivim.data.dao.ItemcategoryMapper;
import com.mivim.data.model.Category;
import com.mivim.data.model.CategoryExample;
import com.mivim.data.model.Item;
import com.mivim.data.model.ItemExample;
import com.mivim.data.model.Itemcategory;
import com.mivim.data.model.ItemcategoryExample;

@Repository
@Resource(name = "adminItemDao")
public class AdminItemDao implements IAdminItemDao {

	

	@Autowired
	private ItemMapper itemMapper;
	
	@Autowired
	private CustomUtilsMapper customUtilsMapper;
	
	@Autowired
	@Qualifier("utils")
	Utils utils;

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

	@Autowired
	private ItemcategoryMapper itemCategoryMapper;

	@Autowired(required = true)
	@Qualifier("itemCategory")
	Itemcategory itemCategory;

	@Autowired(required = true)
	@Qualifier("itemCategoryExample")
	ItemcategoryExample itemCategoryExample;
	
	

	@Override
	public int addItem(AdminItemsDto dto) {
		int status = 0;

		item.setItemName(dto.getItemName());
		item.setInventary(dto.getInventary());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		String itemId = getUserId();
		item.setId(itemId);
		status = itemMapper.insert(item);

		if (status == 1) {
			status=setItemCategory(dto.getCategory(), dto.getSubCategory(), itemId);
		}
		
		return status;

	}

	@Override
	public int updateItem(AdminItemsDto dto) {

		item.setItemName(dto.getItemName());
		item.setInventary(dto.getInventary());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		item.setId(dto.getId());
		int status = itemMapper.updateByPrimaryKey(item);
		if (status == 1) {
			status=updateItemCategory(dto.getCategory(), dto.getSubCategory(), dto.getId());
		}
		
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
	public int setItemCategory(String categoryId, String subCategoryId, String itemId) {
		int itemCategoryStatus = 0;
		itemCategory.setCategoryId(categoryId);
		itemCategory.setSubCategoryId(subCategoryId);
		itemCategory.setItemId(itemId);
		itemCategoryStatus = itemCategoryMapper.insert(itemCategory);
		return itemCategoryStatus;
	}
	
	@Override
	public int updateItemCategory(String categoryId, String subCategoryId, String itemId) {
		int itemCategoryStatus = 0;
		itemCategory.setCategoryId(categoryId);
		itemCategory.setSubCategoryId(subCategoryId);
		itemCategory.setItemId(itemId);
		itemCategoryStatus = itemCategoryMapper.updateByPrimaryKey(itemCategory);
		return itemCategoryStatus;
	}

	@Override
	public Utils getItems(String id) {
		
		Utils utils=customUtilsMapper.selectbyId(id);
		
		return utils;
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<CategoryDto> categoryList = new ArrayList<CategoryDto>();

		//categoryExample.setDistinct(true);
		categoryExample.clear();
		categoryExample.or().andParentIdEqualTo("0");
		List<Category> list = categoryMapper.selectByExample(categoryExample);

		for (Category category : list) {
			CategoryDto categoryDto = new CategoryDto();

			categoryDto.setCategoryName(category.getCategoryName());
			categoryDto.setId(category.getId());
			categoryDto.setParentId(category.getParentId());

			categoryList.add(categoryDto);

		}
	   System.out.println("*****************************\n\n\n");
       
	   System.out.println(categoryList);
	   
	   System.out.println("*****************************\n\n\n");
			 //  categoryExample.clear();
		return categoryList;
	}

	@Override
	public List<CategoryDto> getSubCategories(CategoryDto dto) {

		List<CategoryDto> subCategoriesList = new ArrayList<CategoryDto>();

		//categoryExample.setDistinct(true);
		categoryExample.clear();
		categoryExample.or().andParentIdEqualTo(dto.getId());
		List<Category> list = categoryMapper.selectByExample(categoryExample);

		for (Category subCategory : list) {
			CategoryDto subCategoryDto = new CategoryDto();
			subCategoryDto.setCategoryName(subCategory.getCategoryName());
			subCategoryDto.setId(subCategory.getId());
			subCategoryDto.setParentId(subCategory.getParentId());

			subCategoriesList.add(subCategoryDto);

		}
	//	categoryExample.clear();
		return subCategoriesList;
	}

	public static Date getDate() {
		return new java.sql.Date(Calendar.getInstance().getTimeInMillis());

	}

	public static String getUserId() {
		return UUID.randomUUID().toString();
	}

	public static int getStatusCode() {
		return 1;
	}

	@Override
	public List<Item> getAllItems() {
		
		itemExample.or().andStatusEqualTo(1);
		List<Item> list=itemMapper.selectByExample(itemExample);
		
		return list;
	}

}
