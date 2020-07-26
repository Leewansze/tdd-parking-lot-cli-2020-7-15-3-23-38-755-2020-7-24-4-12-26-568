package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SuperSmartBoy {
    List<ParkingLot> parkingLots = new ArrayList<>();

    public SuperSmartBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket parkCarInLargerAvailPositionRateLot(Car car) {
        double  availPosrate = countAvailPositionRate(parkingLots.get(0).getParkingLotCapacity());
        ParkingLot parkingLot = parkingLots.get(0);
        for(int index = 0; index < parkingLots.size(); index++){
            double currentRate = countAvailPositionRate(parkingLots.get(index).getParkingLotCapacity());
            if( currentRate > availPosrate){
                return parkingLots.get(index).parkCar(car);
            }
        }
        return null;
    }
    public double countAvailPositionRate(int capacity){
        return (capacity) / 10;
    }
}
