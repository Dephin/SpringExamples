package controller;


import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
//@RequestMapping("/home")
public class Controller {
    @RequestMapping("/home")
    public String index() {
        return "index";
    }
}
