package com.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.impl.ConvertCurrencyImpl;
import com.basic.model.ConvertCurrencyRequest;

@RestController
public class BasicServiceController {
	
	@Autowired
	private ConvertCurrencyImpl convertCurrencyImpl;
	
	@RequestMapping(method={RequestMethod.POST}, value="/getCurrency")
	public String convertCurrency(@RequestBody ConvertCurrencyRequest convertCurrencyRequest){
		return convertCurrencyImpl.convertCurrency(convertCurrencyRequest);
	}
}
