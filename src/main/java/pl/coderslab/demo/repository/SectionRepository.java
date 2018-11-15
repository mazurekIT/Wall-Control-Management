package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.User;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long> { //repozytorium dla User (punkt styku z frameworkiem)

    Section findByDayOfWeek(String name);
    Section findOneById(Long id);
}
