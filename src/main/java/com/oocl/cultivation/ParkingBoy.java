package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingBoy extends AbstractParkingBoy{
    private List<ParkingLot> parkingLots = new ArrayList<>();

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        ParkingLot targetParkingLot = parkingLots.stream()
                .filter(parkingLot -> (!parkingLot.isFillOutParkingLotCapacity()))
                .collect(Collectors.toList())
                .get(0);

        return targetParkingLot.parkCar(car);
    }
}
