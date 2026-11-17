package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Exit;
import de.hsd.inflab.parkinggarage.simulator.SimClock;


import java.time.Duration;

public class R3 implements Exit {

    @Override
    public Receipt processOutgoing(
            Ticket ticket,
            Vehicle vehicle,
            SimClock clock) {

        Duration time = Duration.between(
            ticket.getTimeStamp(),
            clock.now()
        );

        long minutes = time.toMinutes();
        long hours = (minutes + 59) / 60;
        
        if (minutes <= 15) {

            return new Receipt(0, time, vehicle.getVehicleType());
        }

        else{
            long amount = hours *2;
            return new Receipt((int) amount,time,vehicle.getVehicleType()); 
        }

    }
}