package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket parkingBoyParkCar(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!(parkingLot.isFillOutParkingLotCapacity())) {
                return parkingLot.parkCar(car);
            }
       }
        return null;

    }
}
