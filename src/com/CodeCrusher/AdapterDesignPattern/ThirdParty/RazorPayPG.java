package com.CodeCrusher.AdapterDesignPattern.ThirdParty;

public class RazorPayPG {
	public String initiatePayment(String orderNumber){
		System.out.println("Payment started using Razor Pay");
		return "RazorPay";
	}

}
