package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.*;
import pl.coderslab.demo.domain.dto.CartDto;
import pl.coderslab.demo.service.CartService;
import pl.coderslab.demo.service.ClientService;
import pl.coderslab.demo.service.TicketService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController { //strefa chroniona skonfigurowana w SecurityConfig

    @Autowired
    CartService cartService;
    @Autowired
    ClientService clientService;
    @Autowired
    TicketService ticketService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String shocart(Model model) {
        List<Cart> carts = cartService.findAll();
        model.addAttribute("carts", carts);
        return "/cart/index";
    }


    //---------------------------------------------------------------------------
    //---add cart
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {
        return "cart/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String register(@Valid CartDto dto, BindingResult result) {
        Cart cart = null;

        if (!result.hasErrors()) {
            try {
                cart = cartService.addCart(dto);
            } catch (Exception e) {
                return "cart/add";
            }

            if (cart != null) {
                return "redirect:/cart/all";
            }
        }
        return "cart/add";

    }

    //---------------------------------------------------------------------------
    //---delete carts
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        Cart cartToDelete = cartService.findOneById(id);
        cartService.delete(cartToDelete);
        return "redirect:/cart/all";
    }
    //---------------------------------------------------------------------------
    //---update carts
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("cart", cartService.findOneById(id));
        return "cart/update";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public String update(@Valid Cart cart, BindingResult result) {
        List<Ticket> ticket = cart.getTicket();
        double v = 0.;
        for (Ticket x:ticket             ) {
            v+=x.getValue();
        }
        cart.setValue(v);
        cartService.save(cart);
        return "redirect:/cart/all";

    }

  







    //---------------------------------------------------------------------------
    //---dodane listy
    //---------------------------------------------------------------------------
    @ModelAttribute("tickets")
    public List<Ticket> tickets() {
        return ticketService.findAll();
    }

    @ModelAttribute("clients")
    public List<Client> clients() {
        List<Client> all = clientService.findAll();
        return all;
    }




}
