package pl.coderslab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.Cart;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    //repozytorium dla User (punkt styku z frameworkiem)

    List<Cart> findByClientFirstName(String name);



    @Query(value = "SELECT DATE(cart.created),sum(value) FROM cart GROUP BY cart.created", nativeQuery = true)
    List<Cart> findAllByGrupByCreated();

    Cart findOneById(long id);

}
