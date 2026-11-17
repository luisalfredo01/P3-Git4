package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;

import java.time.LocalDateTime;


import de.hsd.inflab.parkinggarage.simulator.SimClock;

public interface Exit {
    public Receipt processOutgoing(Ticket ticket, Vehicle vehicle, SimClock clock);
}
