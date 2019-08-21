package com.neusoft.heat.fee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.heat.fee.mapper.IHtHeatingPriceMapper;
import com.neusoft.heat.fee.model.HtHeatingPriceModel;

@Service
@Transactional
public class HeatingPriceServiceImpl implements IHeatingPriceService {
	@Autowired
	private IHtHeatingPriceMapper hhp_mapper;

	@Override
	public List<HtHeatingPriceModel> getByAll() throws Exception {
		return hhp_mapper.selectByAll();
	}
}
