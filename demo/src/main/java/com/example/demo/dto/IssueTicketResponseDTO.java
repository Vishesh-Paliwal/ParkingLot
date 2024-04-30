package com.example.demo.dto;

import com.example.demo.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;
}
