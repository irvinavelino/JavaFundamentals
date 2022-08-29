package com.encora.travelbooking.bookingprocess;

import com.encora.travelbooking.domain.TravelTicket;

public class BookingSystemNumberTwo implements BookingSystem
{

    @Override
    public void setTravelTicket(TravelTicket ticket) {
        System.out.println(ticket);
    }

    @Override
    public void requestBooking() {

    }

    @Override
    public boolean getStatus() {
        return false;
    }

    @Override
    public boolean cancel() {
        return false;
    }
}
