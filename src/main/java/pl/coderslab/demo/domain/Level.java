package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Level extends BaseEntity{

    public String name;



}
