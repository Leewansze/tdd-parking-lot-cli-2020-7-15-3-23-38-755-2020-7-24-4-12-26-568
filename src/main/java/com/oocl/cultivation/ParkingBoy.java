package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingBoy {
    private Map<Ticket, Car> parkingBoy;
    private Ticket ticket;

    public ParkingBoy() {
        this.parkingBoy = new HashMap<>();
    }

    public Ticket parkCar(Car car) {
        Ticket ticket = new Ticket();
        this.parkingBoy.put(ticket, car);
        return ticket;
    }

    public Car fetchCar(Ticket ticket) {
        return this.parkingBoy.get(ticket);
    }
}
