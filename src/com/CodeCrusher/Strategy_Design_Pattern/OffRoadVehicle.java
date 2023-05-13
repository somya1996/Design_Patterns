package com.CodeCrusher.Strategy_Design_Pattern;

import com.CodeCrusher.Strategy_Design_Pattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
	OffRoadVehicle(){
		super(new SportDriveStrategy());
	}
}
