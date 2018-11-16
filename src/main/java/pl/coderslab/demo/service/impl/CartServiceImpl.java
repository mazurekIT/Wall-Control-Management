package pl.coderslab.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.demo.domain.Cart;
import pl.coderslab.demo.domain.Ticket;
import pl.coderslab.demo.domain.dto.CartDto;
import pl.coderslab.demo.repository.CartRepository;
import pl.coderslab.demo.repository.UserRepository;
import pl.coderslab.demo.service.CartService;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    //implementujemy kontrakt dla serwisu usera
    // główne zalety to łatwiejsza możliwość testowania serwisów
    // późniejsze możliwości rozwoju dzięki przesłanianiu przez interfejs
    // (możemy stworzyć nowy serwis który działa inaczej - np laczy sie z innym kontenerem danych - a dla
    // reszty aplikacji jest to przezroczyste)
    // dodatkowo mamy zapewniona separacje miedzy warstwami aplikacji (clean architecture)


    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public Cart save(Cart c) {
        return cartRepository.save(c);
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }


    public Cart addPriceCart(CartDto dto) {

        Cart cart = new Cart();

        cart.setCreated(LocalDate.now());
//        cart.setClient(userRepository);

        return cartRepository.save(cart);
    }

    @Override
    public Cart findOneById(Long id) {
        return cartRepository.findOneById(id);
    }

    @Override
    public void delete(Cart cart) {
        cartRepository.delete(cart);
    }

    @Override
    public Cart addCart(CartDto dto) {

        Cart cart = new Cart();
        cart.setClient(dto.getClient());
        Double valueCart = 0.;
        List<Ticket> ticketList = dto.getTicket();
        cart.setTicket(dto.getTicket());

        for (Ticket x : ticketList) {
            valueCart+=x.getValue();
        }

        cart.setValue(valueCart);
        return cartRepository.save(cart);
    }
    @Override
    public Cart updateCart(CartDto dto) {

        Cart cart = new Cart();
        cart.setClient(dto.getClient());
        Double valueCart = 0.;
        List<Ticket> ticketList = dto.getTicket();
        cart.setTicket(dto.getTicket());

        for (Ticket x : ticketList) {
            valueCart+=x.getValue();
        }

        cart.setValue(valueCart);
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> findAllByGrupByCreated() {
        return cartRepository.findAllByGrupByCreated();
    }


}