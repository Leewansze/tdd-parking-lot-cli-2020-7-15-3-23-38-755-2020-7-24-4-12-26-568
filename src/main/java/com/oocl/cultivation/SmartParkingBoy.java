package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SmartParkingBoy {
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket parkCarInMorePositionParkingLot(Car car) {
        ParkingLot parkingLotMax = parkingLots.get(0);
        for(int index = 0; index < parkingLots.size(); index++){
            if(parkingLotMax.getParkingLotCapacity() < parkingLots.get(index).getParkingLotCapacity()){
                parkingLotMax = parkingLots.get(index);
            }
        }

        Ticket ticket = parkingLotMax.parkCar(car);
//        System.out.println(parkingLots.get(1).getParkingLotCapacity());
//        System.out.println(parkingLots.get(0).getParkingLotCapacity());
        return ticket;
    }

}
