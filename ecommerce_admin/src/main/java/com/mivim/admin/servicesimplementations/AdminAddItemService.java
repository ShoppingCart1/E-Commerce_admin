package com.mivim.admin.servicesimplementations;

import com.mivim.admin.daoimplementations.AdminAddItemDao;
import com.mivim.admin.dto.AdminAddItemDto;
import com.mivim.admin.servicesinterfaces.IAdminAddItemService;

public class AdminAddItemService implements IAdminAddItemService{

	@Override
	public int getAddItemService(AdminAddItemDto adminAddItemDto, AdminAddItemDao adminAddItemDao) {
		int addItem = adminAddItemDao.getAddItemDao(adminAddItemDto);
		return 0;
	}

	
	
}
