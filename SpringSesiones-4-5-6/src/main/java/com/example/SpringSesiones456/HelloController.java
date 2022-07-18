package com.example.SpringSesiones456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Ejercicio 1

    @GetMapping("/hola")
    public String saludo() {
        return "Hola Mundo!";
    }
}
