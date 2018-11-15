package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Wall;
import pl.coderslab.demo.domain.dto.WallDto;
import pl.coderslab.demo.service.WallService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/wall")
public class WallController { //strefa chroniona skonfigurowana w SecurityConfig

    @Autowired
    WallService wallService;


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Wall> walls = wallService.findAll();
        model.addAttribute("walls", walls);
        return "/wall/index";
    }








}
