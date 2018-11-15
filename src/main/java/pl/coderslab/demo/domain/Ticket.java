package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.swing.border.EmptyBorder;

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


}
