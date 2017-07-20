package com.mivim.admin.serviceimplementations;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mivim.admin.dao.IAdminItemDao;
import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.AdminUtilDto;
import com.mivim.admin.service.IAdminUtilService;

	@Service
	@Resource(name="adminUtilService")
	public class AdminUtilService implements IAdminUtilService {

		@Autowired(required = true)
		@Qualifier("adminItemDao")
		IAdminItemDao adminItemDao;	
		
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
		
		
		public List<AdminItemsDto> getData()
		{
			List<AdminItemsDto> itemsList = adminItemDao.getItems();
			return itemsList;
		}
}
