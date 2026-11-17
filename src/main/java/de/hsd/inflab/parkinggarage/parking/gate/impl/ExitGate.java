package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Exit;
import de.hsd.inflab.parkinggarage.simulator.SimClock;

import java.time.Duration;



public class ExitGate implements Exit {
    public Receipt processOutgoing(Ticket ticket, Vehicle vehicle, SimClock clock) {
        return new Receipt(500, Duration.ofMinutes(90), VehicleTypes.CAR);
    }
}
