package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.parking.Lot;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Entrance;
import de.hsd.inflab.parkinggarage.simulator.SimClock;

import java.time.LocalDateTime;

public class R1 implements Entrance {

    @Override
    public Ticket processIncoming(
            Lot lot,
            Vehicle vehicle,
            SimClock clock) {

        if (lot.isFull()) {
            return Ticket.denyEntry("Parking lot is full.");
        }

        return Ticket.issue(clock.now());
    }
}