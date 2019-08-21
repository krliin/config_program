package com.neusoft.heat.fee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.heat.fee.model.HtHeatingPriceModel;


/**
 * 
 * @Description
 * @author:林康荣
 * @date:2019年8月9日 上午11:21:27
 */
@Mapper
public interface IHtHeatingPriceMapper {
	// 查看所有记录
	public List<HtHeatingPriceModel> selectByAll() throws Exception;


}
