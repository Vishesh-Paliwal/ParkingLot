package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ParkingSpot extends BaseModel{
    private int spotNumber ;
    private List<VehicleType> vehicles;
    private GateStatus status;
    private ParkingFloor parkingFloor;
}
