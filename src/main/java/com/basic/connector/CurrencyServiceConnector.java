package com.basic.connector;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.basic.model.GetCurrencyResponse;

@Component
public class CurrencyServiceConnector {

	public GetCurrencyResponse getCurrency(String baseCurrency) {
		RestTemplate restTemplate = new RestTemplate();
		GetCurrencyResponse response = restTemplate.getForObject("https://api.fixer.io/latest?base=" +baseCurrency,
				GetCurrencyResponse.class);
		return response;
	}
}
