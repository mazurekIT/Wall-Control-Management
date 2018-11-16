package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.Section;
import pl.coderslab.demo.domain.User;
import pl.coderslab.demo.service.CartService;
import pl.coderslab.demo.service.LevelService;
import pl.coderslab.demo.service.SectionService;
import pl.coderslab.demo.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController { //strefa chroniona skonfigurowana w SecurityConfig

    @Autowired
    SectionService sectionService;
    @Autowired
    CartService cartService;
    @Autowired
    LevelService levelService;
    @Autowired
    UserService userService;

    //---------------------------------------------------------------------------
    //---SEKCJE szukane po dniu
    //---------------------------------------------------------------------------
    @RequestMapping(path = "/days", method = RequestMethod.GET)
    public String sectionByDay(Model model) {
        return "table/days";
    }


    @RequestMapping(path = "/section/byday/{day}", method = RequestMethod.GET)
    public String sectionByDay(@PathVariable String day, Model model) {
        List<Section> sections = sectionService.findAllByDayOfWeek(day);
        model.addAttribute("sections", sections);
        return "table/sectionbyday";
    }

    //---------------------------------------------------------------------------
    //---SEKCJE szukane po levelu
    //---------------------------------------------------------------------------
    @RequestMapping(path = "/levels", method = RequestMethod.GET)
    public String sectionByLevel(Model model) {
        return "table/levels";
    }


    @RequestMapping(path = "/section/bylevel/{lev}", method = RequestMethod.GET)
    public String sectionByLevel(@PathVariable Long lev, Model model) {
        List<Section> sections = sectionService.findAllByLevelId(lev);
        model.addAttribute("sections", sections);
        return "table/sectionbyday";
    }


//---------------------------------------------------------------------------
    //---SEKCJE szukane po instructor
    //---------------------------------------------------------------------------
    @RequestMapping(path = "/instructors", method = RequestMethod.GET)
    public String sectionByInstructor(Model model) {
        return "table/instructors";
    }


    @RequestMapping(path = "/section/byins/{ins}", method = RequestMethod.GET)
    public String sectionByInstructor(@PathVariable Long ins, Model model) {
        List<Section> sections = sectionService.findAllByInstructorId(ins);
        model.addAttribute("sections", sections);
        return "table/sectionbyinstr";
    }


    //---------------------------------------------------------------------------
    //---PODSUMOWUJE dni sprzedażowe
    //---------------------------------------------------------------------------
//    @RequestMapping(path = "/cartbyday", method = RequestMethod.GET)
//    public String groupbyday(Model model) {
//        List<Cart> carts = cartService.findAllByGrupByCreated();
//        model.addAttribute("carts", carts);
//        return "table/cartgroupbyday";
//    }


    //---------------------------------------------------------------------------
    //---listy przekazane do widoku
    //---------------------------------------------------------------------------
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

    @ModelAttribute("levels")
    public List<Level> levels() {
        List<Level> all = levelService.findAll();
        return all;
    }
    @ModelAttribute("instructors")
    public List<User  > instructors() {
        List<User> all = userService.findAll();
        return all;
    }
}
