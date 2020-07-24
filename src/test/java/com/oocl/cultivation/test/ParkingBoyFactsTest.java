package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFactsTest {
    @Test
    void should_return_parking_ticket_when_park_car_given_a_car() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        String carId = "01";

        //when
        Ticket ticket = parkingBoy.parkCar(carId);

        //then
        assertEquals("01", ticket.getCarId());
    }

    @Test
    void should_return_a_car_when_fetch_car_given_parking_ticket_parkingBoy_a_car_in_parkingLot() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = new Ticket("01");

        //when
        String carId = parkingBoy.fetchCar(ticket.getCarId());

        //then
        assertEquals("car", carId);


    }
}
