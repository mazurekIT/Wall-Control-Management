package pl.coderslab.demo.service;

import pl.coderslab.demo.domain.Cart;
import pl.coderslab.demo.domain.dto.CartDto;

import java.util.List;

public interface CartService {

    Cart save(Cart c);

    List<Cart> findAll();

    Cart findOneById(Long id);

    void delete(Cart cart);
    Cart addCart(CartDto dto);
    Cart updateCart(CartDto dto);

    List<Cart> findAllByGrupByCreated();
}
