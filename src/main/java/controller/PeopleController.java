package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.PeopleService;
import service.entity.People;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function
 */
@Controller
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("collection", peopleService.findAll());
        return "collection";
    }

    @RequestMapping("/save")
    public String save(People people){
        peopleService.save(people);
        return "complete";
    }

}
