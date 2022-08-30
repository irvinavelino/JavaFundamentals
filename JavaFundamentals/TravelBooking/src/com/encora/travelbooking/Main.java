package com.encora.travelbooking;

import com.encora.travelbooking.bookingprocess.BookingSystem;
import com.encora.travelbooking.bookingprocess.NewBookingSystem;
import com.encora.travelbooking.domain.*;
import com.encora.travelbooking.exceptions.InvalidTravelDurationException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.BiFunction;

public class Main
{
    public static void main(String[] args) throws InvalidTravelDurationException {
        TrainTicket trainTicket=new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket1= null;
        try {
            trainTicket1 = new TrainTicket(123L,"London","Edinburg",new BigDecimal("59.00"),
                    LocalDateTime.of(2022,3,7,16,03),
                    LocalDateTime.of(2022,3,7,19,03),
                    ClassType.FIRST,3,42);
            trainTicket1.cancel();
            trainTicket.upgrade();
        } catch (InvalidTravelDurationException e) {
            throw new RuntimeException(e);
        }
        //String[] providers={"First","Second"};

        ArrayList<String> providers=new ArrayList<>();
        providers.add("first");
        providers.add("second");

        System.out.println(providers.size());

        BusTicket busTicket= null;
            busTicket = new BusTicket(123L,"London","Edinburg",new BigDecimal("59.00"),
                    LocalDateTime.of(2022,3,7,16,03),
                    LocalDateTime.of(2022,3,7,19,03),providers);
        BusTicket busTicket2 = new BusTicket(124L, "Boston", "New York", new BigDecimal("59.00"),
                LocalDateTime.of(2022, 3, 7, 16, 03),
                LocalDateTime.of(2022, 3, 7, 19, 03), providers);
        BusTicket busTicket3 = new BusTicket(125L,"CDMX","Monterrey",new BigDecimal("59.00"),
                LocalDateTime.of(2022,3,7,16,03),
                LocalDateTime.of(2022,3,7,19,03),providers);
        PlaneTicket planeTicket=new PlaneTicket();
        ArrayList<TravelTicket> tickets=new ArrayList<>();
        //HashSet<BusTicket>busTickets=new HashSet<>();
        tickets.add(busTicket);
        tickets.add(busTicket2);
        tickets.add(busTicket3);
        tickets.add(busTicket3);
        for (TravelTicket b:tickets)
        {
            System.out.println(b.getBookingRef());
        }
        TravelTicket foundTicket=tickets.get(2);
        if (foundTicket instanceof BusTicket)
        {
            System.out.println("This is a bus ticket");
            BusTicket foundBusTicket=(BusTicket) foundTicket;
            System.out.println(foundBusTicket.getPermittedProviders());
        }
        BookingSystem bookingSystem=new NewBookingSystem();
        bookingSystem.setTravelTicket(busTicket3);
        bookingSystem.requestBooking();
        System.out.println(bookingSystem.getStatus());

        BiFunction<TravelTicket,TravelTicket,Integer> departureTimeSort =(TravelTicket a, TravelTicket b)->{
            return a.getDepartureTime().compareTo(b.getDepartureTime());
        };
        Collections.sort(tickets,(a,b)-> a.getDepartureTime().compareTo(b.getDepartureTime()));
    }
}
