package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy extends AbstractParkingBoy{
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!(parkingLot.isFillOutParkingLotCapacity())) {
                return parkingLot.parkCar(car);
            }
        }
        return null;
    }
}
