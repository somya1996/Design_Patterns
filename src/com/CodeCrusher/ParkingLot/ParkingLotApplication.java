package com.CodeCrusher.ParkingLot;

import com.CodeCrusher.ParkingLot.Controller.TicketController;
import com.CodeCrusher.ParkingLot.Repositories.GateRepository;
import com.CodeCrusher.ParkingLot.Repositories.ParkingLotRepository;
import com.CodeCrusher.ParkingLot.Repositories.TicketRepository;
import com.CodeCrusher.ParkingLot.Repositories.VehicleRepository;
import com.CodeCrusher.ParkingLot.services.TicketServices;

public class ParkingLotApplication {
	public static void main(String[] args) {
		GateRepository gateRepository = new GateRepository();
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		TicketRepository ticketRepository = new TicketRepository();
		VehicleRepository vehicleRepository = new VehicleRepository();
		TicketServices ticketServices = new TicketServices(
				gateRepository ,
				vehicleRepository ,
				parkingLotRepository ,
				ticketRepository);

		TicketController ticketController = new TicketController(ticketServices);

		System.out.println("Server is now listening at : 3000");
	}
}
///                        controller
///                       /          \
///             user service          ticket service
///             /       \             /           \
///    user repo.      ticket repo. --|