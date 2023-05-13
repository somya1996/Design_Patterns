package com.CodeCrusher.Strategy_Design_Pattern;

import com.CodeCrusher.Strategy_Design_Pattern.Strategy.DriveStrategy;

public class Vehicle {
	DriveStrategy driveobj;
	Vehicle(DriveStrategy driveobj){
		this.driveobj = driveobj;
	}
	public void drive(){
		driveobj.drive();
	}
}
