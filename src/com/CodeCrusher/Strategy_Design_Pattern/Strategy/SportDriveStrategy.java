package com.CodeCrusher.Strategy_Design_Pattern.Strategy;

public class SportDriveStrategy implements DriveStrategy{
	@Override
	public void drive(){
		System.out.println("Sport Drive Strategy");
	}
}
