package com.mivim.admin.servicesinterfaces;

import com.mivim.admin.daoimplementations.AdminAddItemDao;
import com.mivim.admin.dto.AdminAddItemDto;

public interface IAdminAddItemService {
	public int getAddItemService(AdminAddItemDto adminAddItemDto, AdminAddItemDao adminAddItemDao);
}
