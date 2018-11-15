package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> { //repozytorium dla User (punkt styku z frameworkiem)

    List<Client> findByFirstName(String firstName);
    Client findOneById(Long id);


}
