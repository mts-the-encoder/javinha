package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> herois = List.of(
            new Heroi("TEste1", "Ser rico", 80.0, true, 25),
            new Heroi("TEste2", "Ser", 90.0, true, 65),
            new Heroi("TEste2", "rico", 100.0, true, 45)
    );

    @GetMapping
    public List<Heroi> buscarTodos(){
        return herois;
    }

    @GetMapping("/fav")
    public Heroi getFav(){
        return new Heroi("Batman", "Ser rico", 80.0, true, 25);
    }

}
