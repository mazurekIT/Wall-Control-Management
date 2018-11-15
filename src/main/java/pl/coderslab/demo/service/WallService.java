package pl.coderslab.demo.service;

import pl.coderslab.demo.domain.Wall;
import pl.coderslab.demo.domain.dto.WallDto;

import java.util.List;

public interface WallService {

    Wall save(Wall c);
    List<Wall> findAll();
    Wall findByName(String wallName);
    Wall addWall(WallDto dto);
    Wall findOneById(Long id);
    void delete(Wall wall);


}
