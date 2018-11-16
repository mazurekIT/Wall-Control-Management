package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Ticket extends BaseEntity {

    private String name;
    private Double value;

//
//    @ManyToMany(mappedBy = "ticket")
//    private List<Cart> carts = new ArrayList<>();

}
