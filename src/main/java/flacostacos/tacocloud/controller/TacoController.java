package flacostacos.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TacoController {

    @GetMapping("/")
    public String home() {
        return "tacos";
    }
}
