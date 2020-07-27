package com.oocl.cultivation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmartParkingBoy extends AbstractParkingBoy {
    private List<ParkingLot> parkingLots;

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        ParkingLot targetParkingLot = parkingLots.stream()
                .sorted(Comparator.comparingInt(ParkingLot::getParkingLotCapacity).reversed())
                .collect(Collectors.toList())
                .get(0);

        return targetParkingLot.parkCar(car);
    }
}
