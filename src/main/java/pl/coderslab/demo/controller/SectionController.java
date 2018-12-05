package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Client;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.User;
import pl.coderslab.demo.domain.dto.SectionDto;
import pl.coderslab.demo.service.ClientService;
import pl.coderslab.demo.service.LevelService;
import pl.coderslab.demo.service.SectionService;
import pl.coderslab.demo.service.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/section")
public class SectionController {

    @Autowired
    SectionService sectionService;
    @Autowired
    LevelService levelService;
    @Autowired
    UserService userService;
    @Autowired
    ClientService clientService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String shosection(Model model) {
        List<Section> sections = sectionService.findAll();
        model.addAttribute("sections", sections);
        return "/section/index";
    }


    //---------------------------------------------------------------------------
    //---add section
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {
        return "section/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String register(@Valid SectionDto dto, BindingResult result) {
        Section section = null;


        if (!result.hasErrors()) {
            try {
                section = sectionService.addSection(dto);
            } catch (Exception e) {
                return "section/add";
            }
            if (section != null) {
                return "redirect:/section/all";
            }
        }
        return "section/add";

    }

    //---------------------------------------------------------------------------
    //---delete sections
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        Section sectionToDelete = sectionService.findOneById(id);
        sectionService.delete(sectionToDelete);
        return "redirect:/section/all";
    }
    //---------------------------------------------------------------------------
    //---update sections
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("section", sectionService.findOneById(id));
        model.addAttribute("levels", levels());
        model.addAttribute("instructors", instructors());
        model.addAttribute("clients", clients());
        model.addAttribute("days", days());
        return "section/update";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public String update(@Valid Section section, BindingResult result) {

        if (section.getClients().size() > section.getMaxPerson()) {
            return "redirect:/blad";
        }

        sectionService.save(section);
        return "redirect:/section/all";

    }


    //---------------------------------------------------------------------------
    //---dodanie lst
    //---------------------------------------------------------------------------
    @ModelAttribute("levels")
    public List<Level> levels() {
        return levelService.findAll();
    }

    @ModelAttribute("instructors")
    public List<User> instructors() {
        List<User> all = userService.findAll();
        return all;
    }

    @ModelAttribute("clients")
    public List<Client> clients() {
        List<Client> all = clientService.findAll();
        return all;
    }
    @ModelAttribute("days")
    public List<String> days() {
        List<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");
        return days;
    }
}
