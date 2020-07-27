package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotFactsTest {
    @Test
    void should_return_parking_ticket_when_park_car_given_a_car() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();

        //when
        Ticket ticket = parkingLot.parkCar(car);

        //then
        assertNotNull(ticket);
    }

    @Test
    void should_return_a_car_when_fetch_car_given_parking_ticket_parkingBoy_a_car_in_parkingLot() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();

        //when
        Ticket ticket = parkingLot.parkCar(car);
        Car carGetFromParkingBoy = parkingLot.fetchCar(ticket);

        //then
//        assertNotNull(ticket);
//        assertEquals(car, carGetFromParkingBoy);
        assertNotNull(carGetFromParkingBoy);
    }

    @Test
    void should_return_2_tickets_when_park_car_given_2_cars_and_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car firstCar = new Car();
        Car secondCar = new Car();

        //when
        Ticket firsTicket = parkingLot.parkCar(firstCar);
        Ticket secondTicket = parkingLot.parkCar(secondCar);

        Car getfirstCarFromParkingBoy = parkingLot.fetchCar(firsTicket);
        Car getSecondCarFromParkingBoy = parkingLot.fetchCar(secondTicket);

        //then
        assertEquals(firstCar, getfirstCarFromParkingBoy);
        assertEquals(secondCar, getSecondCarFromParkingBoy);
    }

    @Test
    void should_return_a_right_car_when_fetch_given_a_right_ticket_a_right_car() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        Ticket ticket = parkingLot.parkCar(car);

        //when
        Car rightCar = parkingLot.fetchCar(ticket);

        //then
        assertEquals(car, rightCar);

    }

    @Test
    void should_return_null_when_fetch_car_given_a_wrong_ticket_and_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Ticket fakeTicket = new Ticket();

        //when
        Car noExistCar = parkingLot.fetchCar(fakeTicket);

        //then
        assertEquals(null, noExistCar);
    }

    @Test
    void should_return_null_when_fetch_car_given_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();

        //when
        Car noExistCar = parkingLot.fetchCar(null);

        //then
        assertEquals(null, noExistCar);
    }

    @Test
    void should_return_null_when_fetch_car_given_a_outdate_ticket_and_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car parkingCar = new Car();
        Ticket ticket = parkingLot.parkCar(parkingCar);

        //when
        parkingLot.fetchCar(ticket);
        Car secondFetch = parkingLot.fetchCar(ticket);

        //then
        assertEquals(null, secondFetch);
    }

    @Test
    void should_return_a_car_and_when_park_given_a_car_parkingLot_capacity_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
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
        Ticket ticket1 = parkingLot.parkCar(car1);
        Ticket ticket2 = parkingLot.parkCar(car2);
        Ticket ticket3 = parkingLot.parkCar(car3);
        Ticket ticket4 = parkingLot.parkCar(car4);
        Ticket ticket5 = parkingLot.parkCar(car5);
        Ticket ticket6 = parkingLot.parkCar(car6);
        Ticket ticket7 = parkingLot.parkCar(car7);
        Ticket ticket8 = parkingLot.parkCar(car8);
        Ticket ticket9 = parkingLot.parkCar(car9);
        Ticket ticket10 = parkingLot.parkCar(car10);
        Ticket ticket11 = parkingLot.parkCar(car11);

        //then
        assertEquals(null, ticket11);
    }

    @Test
    void should_return_error_message_when_fetch_car_given_a_wrong_ticket_a_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Ticket ticket = new Ticket();

        //when
        String errMessage = parkingLot.fetchCarReturnDetail(ticket);

        //then
        assertEquals("Unrecognized parking ticket.", errMessage);
    }

    @Test
    void should_return_error_message_when_fetch_car_given_null_ticket_a_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();

        //when
        String errorMessage = parkingLot.fetchCarReturnDetail(null);

        //then
        assertEquals("Please provide your parking ticket.", errorMessage);
    }

    @Test
    void should_return_errorMessage_when_park_given_a_car_parkingLot_without_position_parkingBoy() {
        //given
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();

        //when
        for(int times = 0; times < 11; times++){
            parkingLot.parkCarReturnDetail(car);
        }
        String errorMessage = parkingLot.parkCarReturnDetail(car);

        //then
        assertEquals("Not enough position.", errorMessage);
    }
}
