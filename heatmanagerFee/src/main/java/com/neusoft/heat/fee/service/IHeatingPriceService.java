package com.neusoft.heat.fee.service;

import java.util.List;

import com.neusoft.heat.fee.model.HtHeatingPriceModel;

/** 
 *
 * @Description: 
 * @author 林康荣  
 * @date 2019年8月11日
 */
public interface IHeatingPriceService {
	// 查看所有记录
	public List<HtHeatingPriceModel> getByAll() throws Exception;
	}
