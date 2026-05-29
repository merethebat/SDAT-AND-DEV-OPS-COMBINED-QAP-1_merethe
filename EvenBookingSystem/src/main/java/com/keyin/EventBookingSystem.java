// Author: Merethe Batino
// Description: Event Booking System - QAP1
// Date: 2026-05-20

package com.keyin;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventBookingSystem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Event> events = new ArrayList<>();

        System.out.println("Welcome to Merethe's Event Booking System!");

        Event concert = new Event("Summer Festival Concert", "2026-06-15");

        System.out.println("Created event:" + concert.getName());
        System.out.println("Date:" + concert.getDate());
        System.out.println("Capacity:" + concert.getCapacity);

        System.out.println();

        events.add(concert);

        // registering the attendees
        System.out.println(concert.registerAttendee("Karen"));
        System.out.println(concert.registerAttendee("Joey"));
        System.out.println(concert.registerAttendee("Minnie"));

        // event full
        System.out.println(concert.registerAttendee("Jannice"));
        System.out.println("Event is at full capacity. Cannot register Jannice");
        System.out.println();

        //display attendees
        concert.displayAttendees();
        System.out.println();

        //cancel registration
        System.out.println(concert.cancelRegistration("Minnie"));
        System.out.println(concert.cancelRegistration(attendeeName));
        System.out.println(attendeeName + "has successfuly cancelled their registration.");
        System.out.println();

        input.close();

    }

}
