package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.User;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {

    Section findOneById(Long id);
    List<Section> findAllByDayOfWeek(String str);
    List<Section> findAllByLevelId(Long id);
    List<Section> findAllByInstructorId(Long id);
}
