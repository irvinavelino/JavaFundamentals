package com.encora.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RegisterNewTravelTicket
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select the type of ticket");
        System.out.println("1.Bus Ticket");
        System.out.println("2.Train Ticket");
        System.out.println("3.Plane Ticket");
        Integer i= scanner.nextInt();
        scanner.nextLine();
        switch (i)
        {
            case 1:
                BusTicket busTicket=new BusTicket();
                System.out.println("Enter the booking Ref");
                Long ref= scanner.nextLong();
                busTicket.setBookingRef(ref);
                scanner.nextLine();

                System.out.println("Enter origin");
                String origin= scanner.nextLine();
                busTicket.setOrigin(origin);

                System.out.println("Enter destination");
                String destination=scanner.nextLine();
                busTicket.setDestination(destination);

                System.out.println("Enter price");
                String price= scanner.nextLine();
                BigDecimal p=new BigDecimal(price);
                busTicket.setPrice(p);

                System.out.println("Enter departure time");
                String dTime= scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime localDateTime=LocalDateTime.parse(dTime,formatter);
                busTicket.setDepartureTime(localDateTime);

                System.out.println("Enter the arrival time");
                String aTime= scanner.nextLine();
                localDateTime=LocalDateTime.parse(aTime,formatter);
                busTicket.setArrivalTime(localDateTime);

                System.out.println(busTicket);
                break;
            case 2:
                TrainTicket trainTicket=new TrainTicket();
                System.out.println("Enter the booking Ref");
                ref= scanner.nextLong();
                trainTicket.setBookingRef(ref);
                scanner.nextLine();

                System.out.println("Enter origin");
                origin= scanner.nextLine();
                trainTicket.setOrigin(origin);

                System.out.println("Enter destination");
                destination=scanner.nextLine();
                trainTicket.setDestination(destination);

                System.out.println("Enter price");
                price= scanner.nextLine();
                p=new BigDecimal(price);
                trainTicket.setPrice(p);

                System.out.println("Enter departure time");
                dTime= scanner.nextLine();
                formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                localDateTime=LocalDateTime.parse(dTime,formatter);
                trainTicket.setDepartureTime(localDateTime);

                System.out.println("Enter the arrival time");
                aTime= scanner.nextLine();
                localDateTime=LocalDateTime.parse(aTime,formatter);
                trainTicket.setArrivalTime(localDateTime);

                System.out.println("Enter Travel class");
                String travelClass= scanner.nextLine();
                ClassType classType=ClassType.valueOf(travelClass.toUpperCase());
                trainTicket.setTravelClass(classType);

                System.out.println("Enter carriage number");
                Integer carryNumber= scanner.nextInt();
                trainTicket.setCarriageNumber(carryNumber);
                scanner.nextLine();

                System.out.println("Enter seat number");
                Integer seatNumber=scanner.nextInt();
                trainTicket.setSeatNumber(seatNumber);
                scanner.nextLine();

                System.out.println(trainTicket);
                break;
            case 3:
                PlaneTicket planeTicket=new PlaneTicket();
                System.out.println("Enter the booking Ref");
                ref= scanner.nextLong();
                planeTicket.setBookingRef(ref);
                scanner.nextLine();

                System.out.println("Enter origin");
                origin= scanner.nextLine();
                planeTicket.setOrigin(origin);

                System.out.println("Enter destination");
                destination=scanner.nextLine();
                planeTicket.setDestination(destination);

                System.out.println("Enter price");
                price= scanner.nextLine();
                p=new BigDecimal(price);
                planeTicket.setPrice(p);

                System.out.println("Enter departure time");
                dTime= scanner.nextLine();
                formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                localDateTime=LocalDateTime.parse(dTime,formatter);
                planeTicket.setDepartureTime(localDateTime);

                System.out.println("Enter the arrival time");
                aTime= scanner.nextLine();
                localDateTime=LocalDateTime.parse(aTime,formatter);
                planeTicket.setArrivalTime(localDateTime);

                System.out.println("Enter Travel class");
                travelClass= scanner.nextLine();
                classType=ClassType.valueOf(travelClass.toUpperCase());
                planeTicket.setTravelClass(classType);

                System.out.println("Enter seat number");
                seatNumber=scanner.nextInt();
                planeTicket.setSeatNumber(seatNumber);
                scanner.nextLine();

                System.out.println("Enter carriage number");
                Integer stopOvers= scanner.nextInt();
                planeTicket.setStopOvers(stopOvers);
                scanner.nextLine();

                System.out.println(planeTicket);
                break;
        }
    }
}
