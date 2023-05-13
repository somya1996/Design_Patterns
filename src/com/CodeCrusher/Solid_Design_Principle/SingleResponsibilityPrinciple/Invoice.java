package com.CodeCrusher.Solid_Design_Principle.SingleResponsibilityPrinciple;

public class Invoice {
	private Marker marker;
	private int quantity;
	Invoice(Marker marker , int quantity){
		this.marker = marker;
		this.quantity = quantity;
	}
	public int calculateTotal(){
		int price = marker.price * this.quantity;
		return price;
	}
}
