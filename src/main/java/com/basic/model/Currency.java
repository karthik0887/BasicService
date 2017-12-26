package com.basic.model;

public enum Currency {
	INR,USD,GBP,AUD,EUR;

	public static Currency getCurrency(String value){
		if(value.equals("INR")){
			return INR;
		}else if(value.equals("USD")){
			return USD;
		}
		else if(value.equals("GBP")){
			return GBP;
		}
		else if(value.equals("AUD")){
			return AUD;
		}
		else if(value.equals("EUR")){
			return EUR;
		}
		return null;
	}
	
}
