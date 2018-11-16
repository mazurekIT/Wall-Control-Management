package pl.coderslab.demo.service;

import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.dto.SectionDto;

import java.util.List;

public interface SectionService {

    Section save(Section c);
    List<Section> findAll();
    Section findOneById(Long id);
    Section addSection(SectionDto dto);
    void delete(Section section);
    List<Section> findAllByDayOfWeek(String str);
    List<Section> findAllByLevelId(Long id);
}
