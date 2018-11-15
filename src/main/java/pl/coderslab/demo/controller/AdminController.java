package pl.coderslab.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.domain.User;
import pl.coderslab.demo.domain.Wall;
import pl.coderslab.demo.domain.dto.WallDto;
import pl.coderslab.demo.security.CurrentUser;
import pl.coderslab.demo.service.UserService;
import pl.coderslab.demo.service.WallService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController { //strefa chroniona skonfigurowana w SecurityConfig

    @Autowired
    UserService userService;

    @Autowired
    WallService wallService;

    @RequestMapping("")
    public String index(@AuthenticationPrincipal CurrentUser user, Model model){
        model.addAttribute("user",user.getUser());
        return "admin/index";
    }

    //---------------------------------------------------------------------------
    //---show all walls ADMIN
    //---------------------------------------------------------------------------
    @RequestMapping(path = "/walls", method = RequestMethod.GET)
    public String showAlladmin(Model model) {
        List<Wall> walls = wallService.findAll();
        model.addAttribute("walls", walls);
        return "admin/walls";
    }
    //---------------------------------------------------------------------------
    //---show all users [ADMIN]
    //---------------------------------------------------------------------------
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public String showuseradmin(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "admin/users";
    }




    //---------------------------------------------------------------------------
    //---add wall ADMIN
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/addwall", method = RequestMethod.GET)
    public String register() {
        return "wall/addwall";
    }

    @RequestMapping(value = "/addwall", method = RequestMethod.POST)
    public String register(@Valid WallDto dto, BindingResult result) {
        Wall wall = null;

        if (!result.hasErrors()) {
            try {
                wall = wallService.addWall(dto);
            } catch (Exception e) {
                return "admin/addwall";
            }

            if (wall != null) {
                return "redirect:/admin/walls";
            }
        }
        return "admin/addwall";

    }
    //---------------------------------------------------------------------------
    //---add user w HomeController
    //---------------------------------------------------------------------------





    //---------------------------------------------------------------------------
    //---delete walls ADMIN
    //---------------------------------------------------------------------------
    @RequestMapping("/walldelete/{id}")
    public String deletewall(@PathVariable long id) {
        Wall wallToDelete = wallService.findOneById(id);
        wallService.delete(wallToDelete);
        return "redirect:/admin/walls";
    }
    //---------------------------------------------------------------------------
    //---delete users [ADMIN]
    //---------------------------------------------------------------------------
    @RequestMapping("/userdelete/{id}")
    public String delete(@PathVariable long id) {
        User userToDelete = userService.findOneById(id);
        userService.delete(userToDelete);
        return "redirect:/admin/users";
    }

    //---------------------------------------------------------------------------
    //---update walls ADMIN
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/wallupdate/{id}", method = RequestMethod.GET)
    public String updatewall(@PathVariable long id, Model model) {
        model.addAttribute("wall", wallService.findOneById(id));
        return "wall/update";
    }

    @RequestMapping(path = "/wallupdate/{id}", method = RequestMethod.POST)
    public String update(@Valid Wall wall, BindingResult result) {
        wallService.save(wall);
        return "redirect:/admin/walls";

    }


    //---------------------------------------------------------------------------
    //---update users [ADMIN]
    //---------------------------------------------------------------------------

    @RequestMapping(path = "/userupdate/{id}", method = RequestMethod.GET)
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("user", userService.findOneById(id));
        return "user/update";
    }

    @RequestMapping(path = "/userupdate/{id}", method = RequestMethod.POST)
    public String update(@Valid User user, BindingResult result) {
        userService.save(user);
        return "redirect:/admin/users";

    }
}
