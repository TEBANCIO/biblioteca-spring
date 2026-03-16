package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/hola")
    public String saludar(){return "wenas wenas";}
    //sldjaldkjadlskajsd
}
