package com.CodeCrusher.Strategy_Design_Pattern;

public class Client {
	public static void main(String[] args) {
		Vehicle vehicle = new SportVehicle();
		vehicle.drive();
	}
}
