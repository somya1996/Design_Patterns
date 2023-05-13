package com.CodeCrusher.Observer_Design_Pattern.with_observer;

public class EmailService implements Order_Placed_Subscriber{
	EmailService(Flipkart flipkart){
		flipkart.addSubscribers(this);
	}
	@Override
	public void onOrderPlaced(Order order){
		sendEmail(order.customerEmail , "Order is placed");
	}

	public void  sendEmail(String to , String body){
		System.out.println("Sending email to  "+to+" with body "+body);
	}
}
