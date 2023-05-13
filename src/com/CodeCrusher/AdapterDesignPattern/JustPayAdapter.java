package com.CodeCrusher.AdapterDesignPattern;

import com.CodeCrusher.AdapterDesignPattern.ThirdParty.JustPayPG;

import java.util.UUID;

public class JustPayAdapter implements PaymentGateway{
	private JustPayPG justpay = new JustPayPG();
	@Override
	public void initiate(String orderNumber){
		justpay.beginPAyment(UUID.fromString(orderNumber));
	}
	@Override
	public boolean checkStatus(String orderNumber){
		return false;
	}
}
