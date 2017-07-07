package com.mivim.admin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mivim.admin.dto.OrdersDto;
import com.mivim.admin.service.OrderService;

public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/placeOrder",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public Map<String,Object> placeOrder(OrdersDto dto)
	{
		Map<String,Object> map=new HashMap<String,Object>();
		
		orderService.placeOrder(dto);
		return null;
		
	}
}
