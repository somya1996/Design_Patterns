package com.CodeCrusher.AdapterDesignPattern;

import com.CodeCrusher.AdapterDesignPattern.ThirdParty.RazorPayPG;

public class Client {
	public static void main(String[] args) {
		//cant directly dependent on 3rd party
//		RazorPayPG razorpg = new RazorPayPG();
//		razorpg.initiatePayment("12345678");

		PaymentGateway pg = new RazorPayAdapter();
		pg.initiate("12345678");

	}
}
