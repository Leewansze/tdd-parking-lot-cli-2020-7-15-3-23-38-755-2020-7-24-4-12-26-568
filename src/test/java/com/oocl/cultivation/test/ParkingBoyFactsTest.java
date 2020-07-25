package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingBoyFactsTest {
    @Test
    void should_return_parking_ticket_when_park_car_given_a_car() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();

        //when
        Ticket ticket = parkingBoy.parkCar(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_a_car_when_fetch_car_given_parking_ticket_parkingBoy_a_car_in_parkingLot() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();

        //when
        Ticket ticket = parkingBoy.parkCar(car);
        Car carGetFromParkingBoy = parkingBoy.fetchCar(ticket);

        //then
        assertNotNull(ticket);
        assertEquals(car, carGetFromParkingBoy);
    }

    @Test
    void should_return_2_tickets_when_park_car_given_2_cars_and_parkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car firstCar = new Car();
        Car secondCar = new Car();

        //when
        Ticket firsrTicket = parkingBoy.parkCar(firstCar);
        Ticket secondTicket = parkingBoy.parkCar(secondCar);

        Car getfirstCarFromParkingBoy = parkingBoy.fetchCar(firsrTicket);
        Car getSecondCarFromParkingBoy = parkingBoy.fetchCar(secondTicket);

        //then
        assertEquals(firstCar, getfirstCarFromParkingBoy);
        assertEquals(secondCar, getSecondCarFromParkingBoy);
    }

    @Test
    void should_return_a_right_car_when_fetch_given_a_right_ticket_a_right_car() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        Ticket ticket = parkingBoy.parkCar(car);

        //when
        Car rightCar = parkingBoy.fetchCar(ticket);

        //then
        assertEquals(car, rightCar);

    }
}
