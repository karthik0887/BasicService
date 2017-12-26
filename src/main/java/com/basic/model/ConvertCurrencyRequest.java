package com.basic.model;

public class ConvertCurrencyRequest {

	private String from;
	
	private String amount;
	
	private String to;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "ConvertCurrencyRequest [from=" + from + ", amount=" + amount + ", to=" + to + "]";
	}
	
}
