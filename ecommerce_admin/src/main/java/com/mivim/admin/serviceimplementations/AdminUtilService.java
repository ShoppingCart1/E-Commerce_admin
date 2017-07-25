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
import com.mivim.data.custom.model.Utils;
import com.mivim.data.model.Item;

@Service
@Resource(name = "adminUtilService")
public class AdminUtilService implements IAdminUtilService {

	@Autowired(required = true)
	@Qualifier("adminItemDao")
	IAdminItemDao adminItemDao;

	@Override
	public List<AdminItemsDto> getItemDetails() {
		List<AdminItemsDto> list = new ArrayList<AdminItemsDto>();
		List<Item> items = adminItemDao.getAllItems();
		for(Item item:items)
		{
			AdminItemsDto adminItemsDto=new AdminItemsDto();
			adminItemsDto.setId(item.getId());
			adminItemsDto.setItemName(item.getItemName());
			adminItemsDto.setItemDescription(item.getItemDescription());
			adminItemsDto.setUnitPrice(item.getUnitPrice());
			list.add(adminItemsDto);
		}
		return list;
	}

	@Override
	public Utils getItemView(AdminUtilDto dto) {

		return adminItemDao.getItems(dto.getId());
	}

}
