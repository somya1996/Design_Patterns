package com.CodeCrusher.Observer_Design_Pattern.without_observer;

public class Flipkart {
	private Email_Service emailService;
	private SMS_Service smsService;
	private Invoice_Generator invoiceGenerator;
	private Inventory_Management_System inventoryManagementSystem;

	Flipkart(Email_Service emailService ,
	         SMS_Service smsService,
	         Invoice_Generator invoiceGenerator,
	         Inventory_Management_System inventoryManagementSystem){
		this.emailService = new Email_Service();
		this.smsService = new SMS_Service();
		this.invoiceGenerator = new Invoice_Generator();
		this.inventoryManagementSystem = new Inventory_Management_System();
	}

	public void orderPlaced(Order order){
		emailService.sendEmail(order.customerEmail,"order is placed");
		smsService.sendSMS(order.customerPhoneNumber , "order is placed");
		invoiceGenerator.generateInvoice(order.orderId);
		inventoryManagementSystem.update(order.productId);
	}
}
