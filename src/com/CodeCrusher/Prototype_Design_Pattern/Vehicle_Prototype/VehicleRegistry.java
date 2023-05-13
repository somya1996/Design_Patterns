package com.CodeCrusher.Prototype_Design_Pattern.Vehicle_Prototype;

import java.util.HashMap;

public class VehicleRegistry {
	private static HashMap<String,Vehicle> mapVehicles = new HashMap<>();
	static {
		mapVehicles.put("TWO", new TwoWheelerVehicle("120","royal",100000,false));
		mapVehicles.put("FOUR", new FourWheelerVehicle("120","bmw", false,100000,false));

	}
//	public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
//		return mapVehicles.get(vehicle).clone();
//	}
}
