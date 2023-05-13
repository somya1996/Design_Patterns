package com.CodeCrusher.ParkingLot.strategies.spotAssignedStrategy;

import com.CodeCrusher.ParkingLot.Model.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {
	public static SpotAssignmentStrategy getSpotForType(SpotAssignmentStrategyType type){
		return new RandomSpotAssignmentStrategy();
	}
}
/**
 * It is giving us an object based on condition
 **/