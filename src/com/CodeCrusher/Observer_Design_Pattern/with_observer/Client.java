package com.CodeCrusher.Observer_Design_Pattern.with_observer;

public class Client {
	public static void main(String[] args) {
		Flipkart flipkart = new Flipkart();
		Invoice_Generator ig = new Invoice_Generator(flipkart);
		EmailService es = new EmailService(flipkart);
		SMS_Service ss = new SMS_Service(flipkart);

//		flipkart.addSubscribers(ig);
//		flipkart.addSubscribers(es);
//		flipkart.addSubscribers(ss);
	}
}
