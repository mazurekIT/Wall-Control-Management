package pl.coderslab.demo.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.demo.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> { //repozytorium dla User (punkt styku z frameworkiem)

    User findByUsername(String name);
    User findOneById(Long id);
    List<User> findAll();

}
