package com.mivim.admin.serviceimplementations;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.AdminUtilDto;
import com.mivim.admin.service.IAdminUtilService;

	@Service
	@Resource(name="adminUtilService")
	public class AdminUtilService implements IAdminUtilService {

		@Override
		public List<AdminItemsDto> getItemDetails() {
			
			return getData();
		}

		@Override
		public List<AdminItemsDto> getItemView(AdminUtilDto dto) {
			List<AdminItemsDto> itemsData=getData();
			List<AdminItemsDto> item=new ArrayList<AdminItemsDto>();
			for(AdminItemsDto itemDto:itemsData)
			{
				if(itemDto.getId().equals(dto.getId()))
				{
					item.add(itemDto);
				}
			}
			return item;
		}
		
		
		public static List<AdminItemsDto> getData()
		{
			//The code has to be written here to get Item from db
			
			AdminItemsDto item1=new AdminItemsDto();
			item1.setId("02ffb405-7bda-42b5-8929-2e0d33a33ee9");
			item1.setItemName("Mobile");
			item1.setUnitPrice("14500");
			item1.setItemDescription("This is Item Description");
			item1.setItemInventry("21");
			item1.setCategory("100");
			item1.setSubCategory("102");

			AdminItemsDto item2=new AdminItemsDto();
			item2.setId("0808be72-d615-494f-acac-ee2b97b248cd");
			item2.setItemName("Item2 Name");
			item2.setUnitPrice("14500");
			item2.setItemDescription("This is Item Description");
			item2.setItemInventry("21");
			item2.setCategory("200");
			item2.setSubCategory("202");

			AdminItemsDto item3=new AdminItemsDto();
			item3.setId("58f327c7-d8d6-41cd-8c2f-7005189d04de");
			item3.setItemName("Item3 Name");
			item3.setUnitPrice("14500");
			item3.setItemDescription("This is Item Description");
			item3.setItemInventry("21");
			item3.setCategory("300");
			item3.setSubCategory("302");


			AdminItemsDto item4=new AdminItemsDto();
			item4.setId("5f81b73d-7c74-47b7-be47-3a7c0ae43a02");
			item4.setItemName("Item4 Name");
			item4.setUnitPrice("14500");
			item4.setItemDescription("This is Item Description");
			item4.setItemInventry("21");
			item4.setCategory("400");
			item4.setSubCategory("401");

			AdminItemsDto item5=new AdminItemsDto();
			item5.setId("64e985c0-babd-41c8-8ac7-52ba72355e0a");
			item5.setItemName("Item5 Name");
			item5.setUnitPrice("14500");
			item5.setItemDescription("This is Item Description");
			item5.setItemInventry("21");
			item5.setCategory("200");
			item5.setSubCategory("204");


			AdminItemsDto item6=new AdminItemsDto();
			item6.setId("6");
			item6.setItemName("Item6 Name");
			item6.setUnitPrice("14500");
			item6.setItemDescription("This is Item Description");
			item6.setItemInventry("21");
			item6.setCategory("400");
			item6.setSubCategory("402");

			List<AdminItemsDto> list=new ArrayList<AdminItemsDto>();
			list.add(item1);
			list.add(item2);
			list.add(item3);
			list.add(item4);
			list.add(item5);
			list.add(item6);
			return list;
			
		}
}
