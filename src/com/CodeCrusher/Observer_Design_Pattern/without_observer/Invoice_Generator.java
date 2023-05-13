package com.CodeCrusher.Observer_Design_Pattern.without_observer;

public class Invoice_Generator {
	public void generateInvoice(Long orderId){
		System.out.println("Generating invoice for order "+ orderId);
	}
}
