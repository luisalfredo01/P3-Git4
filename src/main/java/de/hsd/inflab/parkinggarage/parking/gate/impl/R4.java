package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.simulator.SimClock;

import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;


public class R4 extends R3 {

    @Override
    public Receipt processOutgoing(
            Ticket ticket,
            Vehicle vehicle,
            SimClock clock) {

        // Primero usa la Regla 3
        Receipt receipt =
                super.processOutgoing(ticket, vehicle, clock);

        int amount = receipt.getAmount();

        // Si R3 determinó que es gratis, sigue siendo gratis
        if (amount == 0) {
            return receipt;
        }

        // Zuschlag / Rabatt
        if (vehicle.getVehicleType() == VehicleTypes.SEMI) {
            amount += 5;

        } else if (vehicle.getVehicleType() == VehicleTypes.MOTORCYCLE) {
            amount -= 1;
        }

        // Precio mínimo: 0 €
        if (amount < 0) {
            amount = 0;
        }

        // Creamos el Receipt definitivo
        return new Receipt(
                amount,
                receipt.getParkingTime(),
                vehicle.getVehicleType()
        );
    }
}