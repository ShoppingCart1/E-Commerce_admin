package com.mivim.admin.serviceimplementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mivim.admin.dto.CategoryDto;
import com.mivim.admin.service.IAddItemCategoryService;

@Service
@Resource(name="addItemCategoryService")

public class AddItemCategoryService implements IAddItemCategoryService{

	
	@Override
	public @ResponseBody Map<Integer, String> getCategories() {
		Map<Integer, String> categories = new HashMap<>();
		categories.put(100, "Men");
		categories.put(200, "Electronics");
		categories.put(300, "Women");
		categories.put(400, "Clothes");
		
		return categories;
	}
	
	@Override
	public @ResponseBody Map<String, String> getSubCategoriesList(CategoryDto dto) {
		HashMap<String, Map> subCategories = new HashMap<>();
		Map<Integer, String> subCategoryMen = new HashMap<>();
		subCategoryMen.put(101, "Watches");
		subCategoryMen.put(102, "EyeWears");
		subCategoryMen.put(103, "Footwears");
		subCategoryMen.put(104, "MenShoes");
		subCategoryMen.put(105, "Jackets");
		
		Map<Integer, String> subCategoryElectronics = new HashMap<>();
		subCategoryElectronics.put(201, "Watches");
		subCategoryElectronics.put(202, "Mobiles");
		subCategoryElectronics.put(203, "Laptops");
		subCategoryElectronics.put(204, "Tablets");
		subCategoryElectronics.put(205, "Pendrives");
		
		Map<Integer, String> subCategoryWomen = new HashMap<>();
		subCategoryWomen.put(301, "Watches");
		subCategoryWomen.put(302, "EyeWears");
		subCategoryWomen.put(303, "Footwears");
		subCategoryWomen.put(304, "WoenShoes");
		subCategoryWomen.put(305, "Lipsticks");
		
		Map<Integer, String> subCategoryClothes = new HashMap<>();
		subCategoryClothes.put(401, "Jackets");
		subCategoryClothes.put(402, "Formals");
		subCategoryClothes.put(403, "Casuals");
		subCategoryClothes.put(404, "Business formals");
		
		subCategories.put("100", subCategoryMen);
		subCategories.put("200", subCategoryElectronics);
		subCategories.put("300", subCategoryWomen);
		subCategories.put("400", subCategoryClothes);

		Map<String, String> finalMap = subCategories.get(dto.getId());
		
		return finalMap;
	}

	@Override
	public int addItem(Map<String, String> addItemParamList) {
		String itemName = addItemParamList.get("itemName");
		String  itemPrice= addItemParamList.get("itemPrice");
		String itemInventry = addItemParamList.get("itemInventry");
		String itemDescription = addItemParamList.get("itemDescription");
		String category = addItemParamList.get("category");
		String subCategory = addItemParamList.get("subCategory");
		
		System.out.println(itemName+" "+itemPrice+" "+itemInventry+" "+itemDescription+" "+category+" "+subCategory);
		return 0;
	}

	

	
	
}
