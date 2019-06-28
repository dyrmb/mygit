package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.ItemMapper;
import com.jt.pojo.Item;
import com.jt.vo.EasyUIData;
@Service
public class ItemserviceImpl implements Itemservice{
@Autowired
	private ItemMapper itemMapper;
	@Override
	public EasyUIData findItem(Integer page, Integer rows) {
	/***
	 * sql: select *from tb_item limit start, rows
	 * 
	 * */
		int total=itemMapper.selectCount(null);
		int start =(page-1)*rows;
		List<Item> listitem = itemMapper.findItemByPage(start, rows);
		
		return new EasyUIData(total,listitem);
	}

	

}
