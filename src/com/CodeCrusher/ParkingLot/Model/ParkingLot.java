package com.CodeCrusher.ParkingLot.Model;

import java.util.List;

public class ParkingLot extends BaseModel{
	private List<ParkingFloor> parkingFloors;
	private List<Gate> gates;
	private List<VehicleType> vehicleTypes;
	private ParkingSpotStatus parkingSpotStatus;
	private SpotAssignmentStrategyType SpotAssignmentStrategyType;
	private FeesCalculatorStrategyType feesCalculatorStrategyType;

	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}

	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}

	public List<Gate> getGates() {
		return gates;
	}

	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}

	public List<VehicleType> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<VehicleType> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}

	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}

	public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
		return SpotAssignmentStrategyType;
	}

	public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
		SpotAssignmentStrategyType = spotAssignmentStrategyType;
	}

	public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
		return feesCalculatorStrategyType;
	}

	public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
		this.feesCalculatorStrategyType = feesCalculatorStrategyType;
	}
}
/**
 * Here we are storing the strategy type (spotAssignmentStrategyType)
 * not storing spotAssignmentStrategy object becoz in a database we cannot store a class we can only store enum.
 * From that spotAssignmentStrategyType how do I get real parking spot object
 *      (how do I get an object of child class based on codition)
 * Using FACTORY DESIGN PATTERN
 */