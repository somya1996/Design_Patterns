package com.CodeCrusher.AdapterDesignPattern;

import com.CodeCrusher.AdapterDesignPattern.ThirdParty.CCAvenuePG;

public class CCAvenueAdapter implements PaymentGateway{
	private CCAvenuePG aaavenue = new CCAvenuePG();
	@Override
	public void initiate(String orderNumber) {
		aaavenue.startPayment(orderNumber);
	}

	@Override
	public boolean checkStatus(String orderNumber) {
		return false;
	}
}
