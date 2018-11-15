package pl.coderslab.demo.service;

import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.dto.LevelDto;

import java.util.List;

public interface LevelService {

    Level save(Level c);
    List<Level> findAll();
    Level findOneById(Long id);
    Level addLevel(LevelDto dto);
    void delete(Level level);

}
