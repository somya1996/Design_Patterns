package com.CodeCrusher.Strategy_Design_Pattern;

import com.CodeCrusher.Strategy_Design_Pattern.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{
	SportVehicle(){
		super(new SportDriveStrategy());
	}
}
