package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ParkingFloor extends BaseModel{
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus status;
}
