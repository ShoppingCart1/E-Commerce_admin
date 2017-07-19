package com.mivim.admin.dao;

import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.admin.dto.AdminLoginDto;
import com.mivim.data.model.Item;

public interface IAdminItemDao {
	public int addItem(AdminItemsDto dto);
	public int updateItem(AdminItemsDto dto);

}
