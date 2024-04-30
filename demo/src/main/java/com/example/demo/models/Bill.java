package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Bill extends BaseModel{
    private Ticket ticket;
    private double amount;
    private Date exitTime;
    private Date paymentTime;
    private BillStatus status;
    private BillStatus billStatus;
}
