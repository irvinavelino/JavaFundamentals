package com.encora.travelbooking.bookingprocess;

import com.encora.travelbooking.domain.TravelTicket;

public interface BookingSystem
{
    public void setTravelTicket(TravelTicket ticket);
    public void requestBooking();
    public boolean getStatus();
    public boolean cancel();
}
