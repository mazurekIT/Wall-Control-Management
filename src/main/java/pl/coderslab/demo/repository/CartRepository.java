package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Cart;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    //repozytorium dla User (punkt styku z frameworkiem)

    List<Cart> findByClientFirstName(String name);

    Cart findOneById(long id);
}
