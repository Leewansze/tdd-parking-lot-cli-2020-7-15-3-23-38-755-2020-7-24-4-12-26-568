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
//        while (iterator.hasNext()) {
//            Object key = iterator.next();
//            if (ticket.equals(key)) {
//                parkingBoy.remove(key);
//            }
//        }
        this.parkingBoy.remove(ticket);
        return car;
    }

    public String fetchCarReturnDetail(Ticket ticket) {
        Car car = this.fetchCar(ticket);
        if(ticket == null){
            return "Please provide your parking ticket.";
        }
        if(car == null){
            return "Unrecognized parking ticket.";
        }
        return car.toString();
    }

    public String parkCarReturnDetail(Car car) {
        return null;
    }
}
