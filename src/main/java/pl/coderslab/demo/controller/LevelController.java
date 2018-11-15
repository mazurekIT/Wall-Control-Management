package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.Level;
import pl.coderslab.demo.domain.dto.LevelDto;
import pl.coderslab.demo.service.LevelService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/level")
public class LevelController {

    @Autowired
    LevelService levelService;


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String sholevel(Model model) {
        List<Level> levels = levelService.findAll();
        model.addAttribute("levels", levels);
        return "/level/index";
    }


    //---------------------------------------------------------------------------
    //---add level
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String register() {
        return "level/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String register(@Valid LevelDto dto, BindingResult result) {
        Level level = null;

        if (!result.hasErrors()) {
            try {
                level = levelService.addLevel(dto);
            } catch (Exception e) {
                return "level/add";
            }

            if (level != null) {
                return "redirect:/level/all";
            }
        }
        return "level/add";

    }

    //---------------------------------------------------------------------------
    //---delete levels
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        Level levelToDelete = levelService.findOneById(id);
        levelService.delete(levelToDelete);
        return "redirect:/level/all";
    }
    //---------------------------------------------------------------------------
    //---update levels
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("level", levelService.findOneById(id));
        return "level/update";
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public String update(@Valid Level level, BindingResult result) {
        levelService.save(level);
        return "redirect:/level/all";

    }


}
