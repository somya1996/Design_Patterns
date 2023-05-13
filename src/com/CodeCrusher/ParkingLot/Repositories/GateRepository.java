package com.CodeCrusher.ParkingLot.Repositories;

import com.CodeCrusher.ParkingLot.Model.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
	private Map<Long , Gate> gates = new TreeMap<>();
	public Optional<Gate> findGateById(Long id){
		if(gates.containsKey(id)){
			return Optional.of(gates.get(id));
		}
		return Optional.empty();
	}

	//Optional <Gate>
	// Optional is like a wrapper over an object
	// we can't use null becoz in production using null is most easy to miss.
}
// To interfare with database or to connect with database we use repository
/**
 * Purpose :
 * To store all the methods of gate:
 * fetch the gate
 * store the gate
 * all the opertation w.r.t gate are store in gate repositories
 */

/**
 *
 */