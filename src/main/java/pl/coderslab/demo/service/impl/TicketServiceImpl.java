package pl.coderslab.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Ticket;
import pl.coderslab.demo.domain.dto.TicketDto;
import pl.coderslab.demo.repository.TicketRepository;
import pl.coderslab.demo.service.TicketService;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private TicketRepository ticketRepository;


    @Override
    public Ticket save(Ticket c) {
        return ticketRepository.save(c);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }



    @Override
    public Ticket findOneById(Long id) {
        return ticketRepository.findOneById(id);
    }


    @Override
    public Ticket addTicket(TicketDto dto) {
        Ticket ticket = new Ticket();
        ticket.setName(dto.getName());
        ticket.setValue(dto.getValue());
        return ticketRepository.save(ticket);
    }

    @Override
    public void delete(Ticket ticket) {
        ticketRepository.delete(ticket);
    }


}