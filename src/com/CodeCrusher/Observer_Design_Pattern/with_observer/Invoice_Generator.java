package com.CodeCrusher.Observer_Design_Pattern.with_observer;

public class Invoice_Generator implements Order_Placed_Subscriber{

	Invoice_Generator(Flipkart flipkart){
		flipkart.addSubscribers(this);
	}
	@Override
	public void onOrderPlaced(Order order) {
		generateInvoice(order.orderId);
	}

	public void generateInvoice (Long orderId){
		System.out.println("Generating invoice for order "+orderId);
	}
}
