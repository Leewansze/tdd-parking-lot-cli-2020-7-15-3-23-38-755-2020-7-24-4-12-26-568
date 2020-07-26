package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParkingLot {
    private Map<Ticket, Car> parkingLot;
    private Ticket ticket;
    private int parkingLotCapacity;

    public ParkingLot() {
        this.parkingLotCapacity = 10;
        this.parkingLot = new HashMap<>();
    }

    public Ticket parkCar(Car car) {
        if(parkingLotCapacity > 0){
            Ticket ticket = new Ticket();
            this.parkingLot.put(ticket, car);
            parkingLotCapacity--;
            return ticket;
        }
        return null;
    }

    public Car fetchCar(Ticket ticket) {
        Car car = this.parkingLot.get(ticket);
        Iterator iterator = parkingLot.keySet().iterator();
//        while (iterator.hasNext()) {
//            Object key = iterator.next();
//            if (ticket.equals(key)) {
//                parkingBoy.remove(key);
//            }
//        }
        this.parkingLot.remove(ticket);
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
        Ticket ticket = this.parkCar(car);
        if(ticket == null){
            return "Not enough position.";
        }
        return ticket.toString();
    }
}
