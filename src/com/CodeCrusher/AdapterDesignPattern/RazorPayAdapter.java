package com.CodeCrusher.AdapterDesignPattern;

import com.CodeCrusher.AdapterDesignPattern.ThirdParty.RazorPayPG;

public class RazorPayAdapter implements PaymentGateway{
	private RazorPayPG razorPay = new RazorPayPG();
	@Override
	public void initiate(String orderNumber) {
		razorPay.initiatePayment(orderNumber);
	}

	@Override
	public boolean checkStatus(String orderNumber) {
		return false;
	}
}
