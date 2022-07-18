package com.example.SpringSesiones456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository repository;

    public LaptopController(LaptopRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/laptops")
    public List<LaptopEntidad> obtenerLaptops() {
        return repository.findAll();
    }

    @PostMapping("/api/laptops")
    public LaptopEntidad crearLaptop(@RequestBody LaptopEntidad laptop) {
        return repository.save(laptop);
    }
}
