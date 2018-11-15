package pl.coderslab.demo.domain;


import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor //tworzy bezargumentowy konstruktor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString //tworzy metode to String
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Integer salary;
    private String password;
    private String address;
    private String phone;
    private String description;
    private int enabled;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private Set<Role> roles;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", enabled=" + enabled +
                ", id=" + id +
                '}';
    }
}
