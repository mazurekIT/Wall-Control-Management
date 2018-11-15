package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    //repozytorium dla User (punkt styku z frameworkiem)

    Ticket findByName(String name);
    Ticket findOneById(Long id);
}
