package com.CodeCrusher.ParkingLot.Controller;

import com.CodeCrusher.ParkingLot.DTOs.IssueTicketRequestDto;
import com.CodeCrusher.ParkingLot.DTOs.IssueTicketResponseDto;
import com.CodeCrusher.ParkingLot.DTOs.ResponseStatus;
import com.CodeCrusher.ParkingLot.Model.Ticket;
import com.CodeCrusher.ParkingLot.services.TicketServices;

public class TicketController {
	private TicketServices ticketServices;

	public TicketController(TicketServices ticketServices){
		this.ticketServices = ticketServices;
	}
	public IssueTicketResponseDto issueTicket(IssueTicketRequestDto request){
		IssueTicketResponseDto response = new IssueTicketResponseDto();
		Ticket ticket ;
		try {
			ticket = ticketServices.issueTicket(
					request.getVehicleType(),
					request.getVehicleNumber(),
					request.getVehicleOwnerName(),
					request.getGateId()
			);
		}catch(Exception e){
			response.getResponseStatus(ResponseStatus.FAILURE);
			return response;
		}

		response.setResponseStatus(ResponseStatus.SUCCESS);
		response.setTicket(ticket);

		return response;
	}
	// 1. Validates the request
	// 2. It calls relevant services
	// 3. It receives input from those
	// 4. It creates output for client
	// Controllers cannot throw an exception but services can throw
}
