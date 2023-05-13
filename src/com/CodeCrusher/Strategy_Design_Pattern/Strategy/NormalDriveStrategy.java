package com.CodeCrusher.Strategy_Design_Pattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
	@Override
	public void drive(){
		System.out.println("Normal Drive Strategy");
	}
}
