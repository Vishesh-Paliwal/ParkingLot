package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Ticket {
    private String number;
    private Date entryTime;
    private Date exitTime;
    private Vehicle vehicle;
    private Gate entryGate;
    private Gate exitGate;
    private Operator operator;
    private ParkingSpot parkingSpot;
}
