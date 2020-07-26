package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingBoyTest {
    @Test
    void should_return_a_ticket_when_park_fill_one_parkingLot_then_move_to_another_given_a_car_two_parkingLot() {
        //given
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        parkingLots.add(new ParkingLot());
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);
        Car car = new Car();

        //when
        for(int i = 0; i < 12; i++){
            Ticket ticket = parkingBoy.parkingBoyParkCar(new Car());
        }
        Ticket ticket = parkingBoy.parkingBoyParkCar(car);

        //then
        assertNotNull(ticket);
    }
}
