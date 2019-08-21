package com.neusoft.heat.fee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.heat.fee.mapper.IHtHeatingPriceMapper;
import com.neusoft.heat.fee.model.HtHeatingPriceModel;
import com.neusoft.heat.fee.service.IHeatingPriceService;

@RestController
@RequestMapping("/heatingPrice")
public class HtHeatingPriceController {
	@Autowired
	private IHeatingPriceService hhp_service = null;

	@GetMapping(value="/list/all")
	public List<HtHeatingPriceModel> getByAll() throws Exception {
		return hhp_service.getByAll();
	}
}
