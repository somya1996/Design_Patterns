package com.CodeCrusher.Observer_Design_Pattern.without_observer;

public class Client {

	public static void main(String[] args) {
//		Invoice_Generator invoiceGenerator = new Invoice_Generator();
//		Email_Service emailService = new Email_Service();
//		SMS_Service smsService = new SMS_Service();
//		Inventory_Management_System inventoryManagementSystem = new Inventory_Management_System();
//		Flipkart fp = new Flipkart();
//		fp.orderPlaced(new Order());

		/** way 2 **/
		Invoice_Generator invoiceGenerator = new Invoice_Generator();
		Email_Service emailService = new Email_Service();
		SMS_Service smsService = new SMS_Service();
		Inventory_Management_System inventoryManagementSystem = new Inventory_Management_System();

		Flipkart flipkart = new Flipkart(
			emailService,
			smsService,
			invoiceGenerator,
			inventoryManagementSystem
	);

        flipkart.orderPlaced(new Order());
	}
}
