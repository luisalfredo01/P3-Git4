package de.hsd.inflab.parkinggarage.parking.gate.impl;

import java.time.LocalDateTime;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.parking.Lot;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Entrance;
import de.hsd.inflab.parkinggarage.simulator.SimClock;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
public class R2 extends R1 {

    @Override
    public Ticket processIncoming(Lot lot, Vehicle vehicle, SimClock clock) {

        Ticket ticket = super.processIncoming(lot, vehicle,clock);

        if (!ticket.isValid()) {
            return ticket;
        }

        if (lot.calculateOccupancy() >= 0.8 && vehicle.getVehicleType() == VehicleTypes.SEMI) {

            return Ticket.denyEntry("No Space for LKWs");
        }

        return ticket;
    }
}