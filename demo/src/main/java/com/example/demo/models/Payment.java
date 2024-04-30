package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter

public class Payment extends BaseModel{
    private PaymentMode mode;
    private PaymentStatus status;
    private Date time;
    private double amount;
}
