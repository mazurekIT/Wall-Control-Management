package pl.coderslab.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Client;
import pl.coderslab.demo.domain.dto.ClientDto;
import pl.coderslab.demo.repository.ClientRepository;
import pl.coderslab.demo.service.ClientService;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client save(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public List<Client> findByClientFirstName(String clientFirstName) {
        return clientRepository.findByFirstName(clientFirstName);
    }

    @Override
    public Client findOneById(Long id) {
        return clientRepository.findOneById(id);
    }


    @Override
    public Client addClient(ClientDto dto) {

        Client client = new Client();

        client.setFirstName(dto.getFirstName());
        client.setLastName(dto.getLastName());
        client.setEmail(dto.getEmail());
        client.setPhone(dto.getPhone());
        client.setBirthDate(dto.getBirthDate());
        client.setKid(dto.isKid());


        return clientRepository.save(client);
    }

    @Override
    public void delete(Client client) {
        clientRepository.delete(client);
    }


}