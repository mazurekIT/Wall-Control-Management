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
public class Client extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String birthDate;
    private boolean kid;



}
