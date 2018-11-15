package pl.coderslab.demo.service;

import com.sun.deploy.association.RegisterFailedException;
import pl.coderslab.demo.domain.Client;
import pl.coderslab.demo.domain.dto.ClientDto;
import pl.coderslab.demo.domain.dto.RegisterDto;

import java.util.List;

public interface ClientService {

    Client save(Client c);
    List<Client> findAll();
    Client findOneById(Long id);
    Client addClient(ClientDto dto);
    void delete(Client client);
}
