package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.dto.LevelDto;

import java.util.List;

@Repository
public interface LevelRepository extends JpaRepository<Level,Long> {
    //repozytorium dla User (punkt styku z frameworkiem)

    Level save(Level level);
    Level findByName(String name);
    Level findOneById(Long id);
    List<Level> findAllByName(String name);
}
