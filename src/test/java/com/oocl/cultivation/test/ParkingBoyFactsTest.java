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

    @Test
    void should_return_null_when_fetch_car_given_a_wrong_ticket_and_parkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        Ticket rightTicket = parkingBoy.parkCar(car);
        Ticket fakeTicket = new Ticket();

        //when
        Car noExistCar = parkingBoy.fetchCar(fakeTicket);

        //then
        assertEquals("Unrecognized parking ticket.", noExistCar);
    }

    @Test
    void should_return_null_when_fetch_car_given_parkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Car noExistCar = parkingBoy.fetchCar(null);

        //then
        assertEquals(null, noExistCar);
    }

    @Test
    void should_return_null_when_fetch_car_given_a_outdate_ticket_and_parkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car parkingCar = new Car();
        Ticket ticket = parkingBoy.parkCar(parkingCar);

        //when
        parkingBoy.fetchCar(ticket);
        Car secondFetch = parkingBoy.fetchCar(ticket);

        //then
        assertEquals("Unrecognized parking ticket.", secondFetch);
    }

    @Test
    void should_return_a_car_and_when_park_given_a_car_parkingLot_capacity_parkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();
        Car car10 = new Car();
        Car car11 = new Car();

        //when
        Ticket ticket1 = parkingBoy.parkCar(car1);
        Ticket ticket2 = parkingBoy.parkCar(car2);
        Ticket ticket3 = parkingBoy.parkCar(car3);
        Ticket ticket4 = parkingBoy.parkCar(car4);
        Ticket ticket5 = parkingBoy.parkCar(car5);
        Ticket ticket6 = parkingBoy.parkCar(car6);
        Ticket ticket7 = parkingBoy.parkCar(car7);
        Ticket ticket8 = parkingBoy.parkCar(car8);
        Ticket ticket9 = parkingBoy.parkCar(car9);
        Ticket ticket10 = parkingBoy.parkCar(car10);
        Ticket ticket11 = parkingBoy.parkCar(car11);

        //then
        assertEquals(null, ticket11);
    }
}
