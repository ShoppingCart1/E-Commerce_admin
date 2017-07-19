package com.mivim.admin.daoImplementations;


import java.sql.Date;
import java.util.Calendar;
import java.util.UUID;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mivim.admin.dao.IAdminDao;
import com.mivim.admin.dao.IAdminItemDao;
import com.mivim.admin.dto.AdminItemsDto;
import com.mivim.data.dao.ItemMapper;
import com.mivim.data.model.Item;

@Repository
@Resource(name="adminItemDao")
public class AdminItemDao implements IAdminItemDao{
	
	@Autowired(required = true)
	@Qualifier("sqlSession")
	
	SqlSessionTemplate sqlSession;
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public int addItem(AdminItemsDto dto) {
		
		Item item = new Item();
		
		item.setItemName(dto.getItemName());
		item.setInventary(dto.getItemInventry());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		item.setId(getUserId());
		
		int status = itemMapper.insert(item);
		System.out.println("successfully added..");
		return status;
	}
	
	@Override
	public int updateItem(AdminItemsDto dto) {
		Item item = new Item();
		
		item.setItemName(dto.getItemName());
		item.setInventary(dto.getItemInventry());
		item.setItemDescription(dto.getItemDescription());
		item.setStatus(getStatusCode());
		item.setUnitPrice(dto.getUnitPrice());
		item.setUpdatedDate(getDate());
		item.setId(dto.getId());
		int status = itemMapper.updateByPrimaryKey(item);
		System.out.println("successfully updated..");
		return status;
	}
	
	
	
	
	public static Date getDate()
	{
		return new java.sql.Date(Calendar.getInstance().getTimeInMillis());
		
	}
	
	
	
	public static String getUserId()
	{
		return UUID.randomUUID().toString();
	}
	
	
	public static int getStatusCode()
	{
		return 1;
	}

}
