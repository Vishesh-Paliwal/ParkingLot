package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<Vehicle> vehicles;

    private ParkingLotStatus status;
}
