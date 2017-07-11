package com.mivim.admin.service;

import java.util.List;

import com.mivim.admin.dto.*;

public interface IAdminUtilService {
	public List<AdminItemsDto> getItemDetails();

	public List<AdminItemsDto> getItemView(AdminUtilDto dto);
}
