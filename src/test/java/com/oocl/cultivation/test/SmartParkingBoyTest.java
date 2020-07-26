package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.SmartParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SmartParkingBoyTest {
    @Test
    void should_return_a_tikcet_when_park_car_to_more_position_parkingLot_given_a_smart_parkingBoy_a_car_3_parkingLots() {
        //given
        List<ParkingLot> parkingLots = new ArrayList<>();
        for (int index = 0; index < 2; index++){
            parkingLots.add(new ParkingLot());
        }
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLots);
        parkingLots.get(0).parkCar(new Car());

        //when
        Ticket ticket = smartParkingBoy.parkCarInMorePositionParkingLot(new Car());

        //then
        assertNotNull(ticket);
    }
}
