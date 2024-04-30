package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private int gateNumber;
    private GateStatus status;
    private Operator operator;
    private GateType gateType;
    private GateStatus gateStatus;
}
