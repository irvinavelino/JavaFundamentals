package com.encora.travelbooking.domain;

import com.encora.travelbooking.exceptions.InvalidTravelDurationException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class TrainTicket extends TravelTicket
{
    private ClassType travelClass;
    private Integer carriageNumber;
    private Integer seatNumber;

    public TrainTicket()
    {}
    public TrainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, ClassType travelClass, Integer carriageNumber, Integer seatNumber) throws InvalidTravelDurationException {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.carriageNumber = carriageNumber;
        this.seatNumber = seatNumber;
    }

    public ClassType getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(ClassType travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(Integer carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void upgrade()
    {
        if (travelClass!=null && travelClass.equals("FIRST"))
        {
            System.out.println("you are first class already");

        }
        else
        {
            this.travelClass=ClassType.FIRST;
            System.out.println("you are now first class");
        }
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "travelClass=" + travelClass +
                ", carriageNumber=" + carriageNumber +
                ", seatNumber=" + seatNumber +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainTicket that = (TrainTicket) o;
        return Objects.equals(travelClass, that.travelClass) && Objects.equals(carriageNumber, that.carriageNumber) && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, carriageNumber, seatNumber);
    }
}
