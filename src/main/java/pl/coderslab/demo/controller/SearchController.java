package pl.coderslab.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.demo.service.SectionService;

@Controller
@RequestMapping("/search")
public class SearchController { //strefa chroniona skonfigurowana w SecurityConfig

    @Autowired
    SectionService sectionService;


    //---------------------------------------------------------------------------
    //---SEKCJE szukane po dniu
    //---------------------------------------------------------------------------
    @RequestMapping(value = "/byday",method = RequestMethod.GET)
    public String index1(){
        return "table/byday";
    }





}
