package pl.coderslab.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Wall extends BaseEntity{

    private String name;
    private String address;
    private String description;
    private String openHours;

//    @ManyToMany
//    private List<Ticket> ticket=new ArrayList<>();

//    @ManyToMany
//    private List<Client> clients = new ArrayList<>();
//
//    @OneToMany
//    private List<Section> sections = new ArrayList<>();

//    @ManyToMany
//    private List<User> users = new ArrayList<>();


}
