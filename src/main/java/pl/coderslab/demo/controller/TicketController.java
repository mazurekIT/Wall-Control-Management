package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Ticket;
import pl.coderslab.demo.domain.dto.TicketDto;
import pl.coderslab.demo.service.TicketService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String shoticket(Model model) {
        List<Ticket> tickets = ticketService.findAll();
        model.addAttribute("tickets", tickets);
        return "/ticket/index";
    }


    //---------------------------------------------------------------------------
    //---add ticket
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {
        return "ticket/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String register(@Valid TicketDto dto, BindingResult result) {
        Ticket ticket = null;

        if (!result.hasErrors()) {
            try {
                ticket = ticketService.addTicket(dto);
            } catch (Exception e) {
                return "ticket/add";
            }

            if (ticket != null) {
                return "redirect:/ticket/all";
            }
        }
        return "ticket/add";

    }

    //---------------------------------------------------------------------------
    //---delete tickets
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        Ticket ticketToDelete = ticketService.findOneById(id);
        ticketService.delete(ticketToDelete);
        return "redirect:/ticket/all";
    }
    //---------------------------------------------------------------------------
    //---update tickets
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("ticket", ticketService.findOneById(id));
        return "ticket/update";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public String update(@Valid Ticket ticket, BindingResult result) {
        ticketService.save(ticket);
        return "redirect:/ticket/all";

    }


}
