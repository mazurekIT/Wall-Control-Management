package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Wall;

import java.util.List;


@Repository
public interface WallRepository extends JpaRepository<Wall, Long> {
    //repozytorium dla Wall (punkt styku z frameworkiem)

    Wall findAllByName(String name);
    Wall findOneById(long id);
}
