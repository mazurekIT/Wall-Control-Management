package pl.coderslab.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.dto.SectionDto;
import pl.coderslab.demo.repository.LevelRepository;
import pl.coderslab.demo.repository.SectionRepository;
import pl.coderslab.demo.repository.UserRepository;
import pl.coderslab.demo.service.SectionService;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    LevelRepository levelRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Section save(Section c) {
        return sectionRepository.save(c);
    }

    @Override
    public List<Section> findAll() {
        return sectionRepository.findAll();
    }


    @Override
    public Section findOneById(Long id) {
        return sectionRepository.findOneById(id);
    }


    @Override
    public Section addSection(SectionDto dto) {

        Section section = new Section();


        section.setDayOfWeek(dto.getDayOfWeek());
        section.setHourStart(dto.getHourStart());
        section.setMaxPerson(dto.getMaxPerson());
        section.setLevel(dto.getLevel());
        section.setInstructor(dto.getInstructor());
        section.setClients(dto.getClients());

        return sectionRepository.save(section);
    }

    @Override
    public List<Section> findAllByDayOfWeek(String str) {
        return sectionRepository.findAllByDayOfWeek(str);
    }

    @Override
    public void delete(Section section) {
        sectionRepository.delete(section);
    }


}