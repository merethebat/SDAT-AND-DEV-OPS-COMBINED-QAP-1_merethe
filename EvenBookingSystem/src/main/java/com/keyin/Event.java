// Author: Merethe Batino
// Description: Event class for Event Booking System - QAP1
// Date: 2026-05-20

package com.keyin;

public class Event {
    private String name;
    private String date;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
