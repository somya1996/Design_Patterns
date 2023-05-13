package com.CodeCrusher.Observer_Design_Pattern.without_observer;

public class Email_Service {
	public void sendEmail(String to , String body){
		System.out.println("Sending email to "+to+" with body "+body);
	}
}
