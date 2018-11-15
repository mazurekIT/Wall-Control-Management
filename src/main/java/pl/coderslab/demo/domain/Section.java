package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Section extends BaseEntity{
    private String dayOfWeek;
    private String hourStart;
    private int maxPerson;

    @ManyToOne
    private Level level;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private User instructor;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Client> clients=new ArrayList<>();

}
