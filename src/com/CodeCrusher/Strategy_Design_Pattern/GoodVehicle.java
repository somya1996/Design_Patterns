package com.CodeCrusher.Strategy_Design_Pattern;

import com.CodeCrusher.Strategy_Design_Pattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{
	GoodVehicle(){
		super(new NormalDriveStrategy());
	}
}
