package com.oocl.cultivation;

public class ParkingBoy {

    public Ticket parkCar(String carId) {
        return new Ticket(carId);
    }

    public String fetchCar(String carId) {
        return "car";
    }
}
