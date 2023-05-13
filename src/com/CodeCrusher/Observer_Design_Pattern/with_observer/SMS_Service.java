package com.CodeCrusher.Observer_Design_Pattern.with_observer;

public class SMS_Service implements Order_Placed_Subscriber{
	SMS_Service(Flipkart flipkart){
		flipkart.addSubscribers(this);
	}

	@Override
	public void onOrderPlaced(Order order) {
		sendSms(order.customerPhoneNumber , "order Placed Successful");
	}

	public void sendSms (String to , String body){
		System.out.println("Sending sms to "+to+ " with body "+ body);
	}

}
