package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Cart extends BaseEntity {

    private LocalDate created = LocalDate.now();
    private Double value;

    @OneToOne
    private Client client;

    @OneToMany
    private List<Ticket> ticket =new ArrayList<>();


}
