package com.CodeCrusher.ParkingLot.DTOs;

import com.CodeCrusher.ParkingLot.Model.Ticket;

public class IssueTicketResponseDto {
	private ResponseStatus responseStatus;
	private Ticket ticket;

	public ResponseStatus getResponseStatus(ResponseStatus failure) {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


}
