package com.CodeCrusher.AdapterDesignPattern;

public interface PaymentGateway {
	public void initiate(String orderNumber);
	public boolean checkStatus(String orderNumber);
}
