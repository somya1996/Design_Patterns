package com.CodeCrusher.Observer_Design_Pattern.without_observer;

public class SMS_Service {
	public void sendSMS(String to , String body){
		System.out.println("Sending sms to "+to+" wwith body "+body);
	}
}
