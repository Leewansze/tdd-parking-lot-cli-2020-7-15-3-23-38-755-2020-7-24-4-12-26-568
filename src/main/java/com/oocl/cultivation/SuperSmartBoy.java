package com.oocl.cultivation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SuperSmartBoy extends AbstractParkingBoy{
    List<ParkingLot> parkingLots;

    public SuperSmartBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Ticket parking(Car car) {
        ParkingLot targetParkingLot = parkingLots.stream()
                .sorted(Comparator.comparingInt(ParkingLot::calculatePositionRate).reversed())
                .collect(Collectors.toList())
                .get(0);
        return targetParkingLot.parkCar(car);
    }
}
