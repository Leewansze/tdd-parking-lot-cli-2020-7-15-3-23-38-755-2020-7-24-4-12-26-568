package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SuperSmartBoyTest {
    @Test
    void should_return_a_ticket_and_right_parkingLot_when_park_in_Larger_avail_position_parkingLot_given_supersmartboy_2_parkingLot_a_car() {
        //given
        List<ParkingLot> parkingLots = new ArrayList<>();
        SuperSmartBoy superSmartBoy = new SuperSmartBoy();
        for(int index = 0; index < 2; index++){
            parkingLots.add(new ParkingLot());
        }
        parkingLots.get(0).parkCar(new Car());

        //when
        Ticket ticket = superSmartBoy.parkCarInLargerAvailPositionRateLot(new Car());

        //then
        assertNotNull(ticket);
        assertEquals(1, parkingLots.get(1).getParkingLot().size());
    }
}
