package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Client;
import pl.coderslab.demo.domain.dto.ClientDto;
import pl.coderslab.demo.service.ClientService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String shoclient(Model model) {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "client/index";
    }


    //---------------------------------------------------------------------------
    //---add client
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {
        return "client/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String register(@Valid ClientDto dto, BindingResult result) {
        Client client = null;

        if (!result.hasErrors()) {
            try {
                client = clientService.addClient(dto);
            } catch (Exception e) {
                return "client/add";
            }

            if (client != null) {
                return "redirect:/client/all";
            }
        }
        return "client/add";

    }

    //---------------------------------------------------------------------------
    //---delete clients
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        Client clientToDelete = clientService.findOneById(id);
        clientService.delete(clientToDelete);
        return "redirect:/client/all";
    }
    //---------------------------------------------------------------------------
    //---update clients
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("client", clientService.findOneById(id));
        return "client/update";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public String update(@Valid Client client, BindingResult result) {
        clientService.save(client);
        return "redirect:/client/all";

    }


}
