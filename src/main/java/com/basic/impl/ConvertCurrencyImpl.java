package com.basic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basic.connector.CurrencyServiceConnector;
import com.basic.model.ConvertCurrencyRequest;
import com.basic.model.GetCurrencyResponse;

@Component
public class ConvertCurrencyImpl {
	
	@Autowired
	private CurrencyServiceConnector currencyServiceConnector;

	public String convertCurrency(ConvertCurrencyRequest convertCurrencyRequest){
		
		Double amount = Double.valueOf(convertCurrencyRequest.getAmount());
		String responseStr = "<No-Response>";
		
		GetCurrencyResponse response = currencyServiceConnector.getCurrency(convertCurrencyRequest.getFrom());
		
		if(response.getRates() != null){
			Double unitRate = response.getRates().get(convertCurrencyRequest.getTo());
			Double convertedAmount = (unitRate*amount);
			
			responseStr = convertedAmount.toString();
		}
		
		return responseStr;
	}
}
