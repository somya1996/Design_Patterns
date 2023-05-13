package com.CodeCrusher.ParkingLot.strategies.spotAssignedStrategy;

import com.CodeCrusher.ParkingLot.Model.Gate;
import com.CodeCrusher.ParkingLot.Model.ParkingSpot;
import com.CodeCrusher.ParkingLot.Model.VehicleType;

public interface SpotAssignmentStrategy {
	public ParkingSpot getSpot(Gate gate , VehicleType vehicleType);
}
