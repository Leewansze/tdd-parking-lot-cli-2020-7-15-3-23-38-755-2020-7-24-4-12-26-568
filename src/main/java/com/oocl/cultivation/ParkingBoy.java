package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Iterator;
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
        Car car = this.parkingBoy.get(ticket);
        Iterator iterator = parkingBoy.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            if (ticket.equals(key)) {
                parkingBoy.remove(key);
            }
        }
        return car;
    }
}
