package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.QueryItemInfoByIdService;

@Controller
public class QueryItemInfoById {
	
	@Autowired
	private QueryItemInfoByIdService queryItemInfoByIdService;
	
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public String query(@PathVariable Long itemId) {
		TbItem tbItem = queryItemInfoByIdService.queryInfo(itemId);
		return "a";
	}

}
