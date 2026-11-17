package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.parking.Lot;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Entrance;
import de.hsd.inflab.parkinggarage.simulator.SimClock;

import java.time.LocalDateTime;


import de.hsd.inflab.parkinggarage.parking.Lot;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;

public class EntranceGate implements Entrance {

    public Ticket processIncoming(Lot lot, Vehicle vehicle, SimClock clock) {
        return Ticket.issue(LocalDateTime.of(2026, 10, 6, 12, 0));
    }


}
