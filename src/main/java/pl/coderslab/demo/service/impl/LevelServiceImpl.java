package pl.coderslab.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.dto.LevelDto;
import pl.coderslab.demo.repository.LevelRepository;
import pl.coderslab.demo.service.LevelService;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    LevelRepository levelRepository;


    @Override
    public Level save(Level c) {
        return levelRepository.save(c);
    }

    @Override
    public List<Level> findAll() {
        return levelRepository.findAll();
    }


    @Override
    public Level findOneById(Long id) {
        return levelRepository.findOneById(id);
    }

    @Override
    public Level addLevel(LevelDto dto) {
        Level level = new Level();
        level.setName(dto.getName());
        return levelRepository.save(level);
    }

    @Override
    public void delete(Level level) {
        levelRepository.delete(level);
    }
}