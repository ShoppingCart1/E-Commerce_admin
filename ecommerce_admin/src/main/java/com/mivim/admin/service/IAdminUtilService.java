package com.mivim.admin.service;

import java.util.List;

import com.mivim.admin.dto.*;
import com.mivim.data.custom.model.Utils;

public interface IAdminUtilService {
	public List<AdminItemsDto> getItemDetails();

	public Utils getItemView(AdminUtilDto dto);
}
