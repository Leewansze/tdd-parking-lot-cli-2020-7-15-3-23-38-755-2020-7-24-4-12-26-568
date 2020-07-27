package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class SmartParkingBoy extends AbstractParkingBoy{
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        ParkingLot parkingLotMax = parkingLots.get(0);
        for(int index = 0; index < parkingLots.size(); index++){
            if(parkingLotMax.getParkingLotCapacity() < parkingLots.get(index).getParkingLotCapacity()){
                parkingLotMax = parkingLots.get(index);
            }
        }

        Ticket ticket = parkingLotMax.parkCar(car);
        System.out.println(parkingLots.get(1).getParkingLot().size());
        System.out.println(parkingLots.get(0).getParkingLot().size());
        return ticket;
    }
}
