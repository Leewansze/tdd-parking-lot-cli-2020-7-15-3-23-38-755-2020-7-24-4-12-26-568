package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SuperSmartBoy extends AbstractParkingBoy{
    List<ParkingLot> parkingLots = new ArrayList<>();

    public SuperSmartBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        int parkingLotMaxRate = parkingLots.get(0).calculatePositionRate();
        ParkingLot parkingLotTmp = null;
        for(ParkingLot parkingLot: parkingLots){
            if(parkingLot.calculatePositionRate() > parkingLotMaxRate){
                parkingLotTmp = parkingLot;
            }
        }
        return parkingLotTmp.parkCar(car);
    }
}
