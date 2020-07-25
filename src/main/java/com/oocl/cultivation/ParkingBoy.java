package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParkingBoy {
    private Map<Ticket, Car> parkingBoy;
    private Ticket ticket;
    private int parkingLotCapacity;

    public ParkingBoy() {
        this.parkingLotCapacity = 10;
        this.parkingBoy = new HashMap<>();
    }

    public Ticket parkCar(Car car) {
        if(parkingLotCapacity > 0){
            Ticket ticket = new Ticket();
            this.parkingBoy.put(ticket, car);
            parkingLotCapacity--;
            return ticket;
        }
        return null;
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
