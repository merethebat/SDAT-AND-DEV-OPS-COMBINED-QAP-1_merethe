// Author: Merethe Batino
// Description: Event class for Event Booking System - QAP1
// Date: 2026-05-20

package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private String date;
    private int capacity;
    private List<String> attendees;
    public String getCapacity;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
        this.capacity = 100; // Default capacity
        attendees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getCapacity() {
        return capacity;
    }

    //register attendees
    public String registerAttendee(String attendeeName) {
        if (attendees.size() < capacity) {
            attendees.add(attendeeName);
            return "Attendee " + attendeeName + " registered successfully.";
        } else {
            return "Event is full. Cannot register. " + attendeeName + ".";
        }
    }

    //cancel registration
    public String cancelRegistration(String attendeeName){
        if (attendees.contains(attendeeName)){
            attendees.remove(attendeeName);
            return name + " Registration cancelled.";
        }
        return attendeeName + " not found.";
    }

    //display attendees
    public void displayAttendees(){
        System.out.println("Attendees for" + name + ":");
        if (attendees.isEmpty()){
            System.out.println("No attendees registered.");
            return;
        }
        for (String person : attendees){
            System.out.println("-" + person);
        }
    }
}

