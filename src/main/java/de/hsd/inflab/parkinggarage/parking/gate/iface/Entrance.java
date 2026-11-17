package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;

import java.time.LocalDateTime;

import de.hsd.inflab.parkinggarage.parking.Lot;
import de.hsd.inflab.parkinggarage.simulator.SimClock;



public interface Entrance {
    Ticket processIncoming(Lot lot, Vehicle vehicle, SimClock clock);
}