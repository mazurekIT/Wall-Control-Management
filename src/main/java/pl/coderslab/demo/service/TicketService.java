package pl.coderslab.demo.service;

import pl.coderslab.demo.domain.Ticket;
import pl.coderslab.demo.domain.dto.TicketDto;

import java.util.List;

public interface TicketService {

    Ticket save(Ticket c);
    List<Ticket> findAll();
    Ticket findOneById(Long id);
    Ticket addTicket(TicketDto dto);
    void delete(Ticket ticket);
}
