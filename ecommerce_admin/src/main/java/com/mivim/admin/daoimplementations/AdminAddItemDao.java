package com.mivim.admin.daoimplementations;

import com.mivim.admin.daointerfaces.IAdminAddItemDao;
import com.mivim.admin.daointerfaces.IAdminLoginDao;
import com.mivim.admin.dto.AdminAddItemDto;

public class AdminAddItemDao implements IAdminAddItemDao {


	@Override
	public int getAddItemDao(AdminAddItemDto adminAddItemDto) {
		return 13;
	}
	
}
