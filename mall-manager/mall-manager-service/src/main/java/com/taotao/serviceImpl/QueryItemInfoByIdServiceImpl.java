package com.taotao.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.dao.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.QueryItemInfoByIdService;

@Service
public class QueryItemInfoByIdServiceImpl implements QueryItemInfoByIdService{

	@Autowired(required=true)
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem queryInfo(Long id) {
		
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		return tbItem;
	}

}
