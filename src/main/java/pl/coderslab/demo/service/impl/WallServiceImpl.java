package pl.coderslab.demo.service.impl;

import com.sun.deploy.association.RegisterFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Role;
import pl.coderslab.demo.domain.User;
import pl.coderslab.demo.domain.Wall;
import pl.coderslab.demo.domain.dto.RegisterDto;
import pl.coderslab.demo.domain.dto.WallDto;
import pl.coderslab.demo.repository.RoleRepository;
import pl.coderslab.demo.repository.UserRepository;
import pl.coderslab.demo.repository.WallRepository;
import pl.coderslab.demo.service.UserService;
import pl.coderslab.demo.service.WallService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class WallServiceImpl implements WallService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private WallRepository wallRepository;


    @Override
    public Wall save(Wall c) {
        return wallRepository.save(c);
    }

    @Override
    public List<Wall> findAll() {
        return wallRepository.findAll();
    }




    @Override
    public Wall findByName(String wallName) {
        return wallRepository.findAllByName(wallName);
    }


    @Override
    public Wall addWall(WallDto dto) {

        Wall wall = new Wall();

        wall.setName(dto.getName());
        wall.setDescription(dto.getDescription());
        wall.setAddress(dto.getAddress());
        wall.setOpenHours(dto.getOpenHours());


        return wallRepository.save(wall);
    }

    @Override
    public Wall findOneById(Long id) {
        return wallRepository.findOneById(id);
    }

    @Override
    public void delete(Wall wall) {
          wallRepository.delete(wall);
    }

}