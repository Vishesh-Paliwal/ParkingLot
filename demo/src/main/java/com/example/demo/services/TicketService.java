package com.example.demo.services;

import com.example.demo.exceptions.InvalidGateException;
import com.example.demo.models.Gate;
import com.example.demo.models.Ticket;
import com.example.demo.models.VehicleType;
import com.example.demo.repositories.GateRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket (Long gateId, String vehicleNumber , String ownerName , VehicleType vehicleType) throws InvalidGateException {
        // Issue a ticket\
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvalidGateException("Invalid Gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getOperator());

        return null;
    }
}
