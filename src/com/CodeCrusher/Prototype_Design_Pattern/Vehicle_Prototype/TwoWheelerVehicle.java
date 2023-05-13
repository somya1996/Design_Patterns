package com.CodeCrusher.Prototype_Design_Pattern.Vehicle_Prototype;

public class TwoWheelerVehicle extends Vehicle{
	private boolean isElectric;


	public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
		super(engine, model, price);
		this.isElectric = isElectric;
	}
	protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
		return (TwoWheelerVehicle) super.clone();
	}
}
