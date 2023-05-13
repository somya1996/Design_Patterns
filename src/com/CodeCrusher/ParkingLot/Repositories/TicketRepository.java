package com.CodeCrusher.ParkingLot.Repositories;

import com.CodeCrusher.ParkingLot.Model.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
	private Map<Long , Ticket> ticketMap = new TreeMap<>();
	private int previousId = 0;
	public Ticket saveTicket(Ticket ticket){
		previousId += 1;
		ticket.setId((long)previousId);
		ticketMap.put((long)previousId , ticket);
		return ticket;
	}
}
