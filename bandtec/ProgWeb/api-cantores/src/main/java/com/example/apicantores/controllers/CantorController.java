package com.example.apicantores.controllers;

import com.example.apicantores.Cantor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cantores")
public class CantorController {

    private List<Cantor> cantores = new ArrayList<>();

    @PostMapping
    public Cantor addCantor(@RequestBody Cantor cantor) {
        cantor.setId(cantores.size() + 1);
        cantores.add(cantor);
        return cantor;
    }

    @JsonIgnore
    @GetMapping("/{id}")
    public Cantor getById(@PathVariable int id) {
        for (Cantor cantor : cantores) {
            if (cantor.getId() == id) {
                return cantor;
            }
        }
        return null;
    }

    @JsonIgnore
    @GetMapping("/celebridades")
    public List<Cantor> getMaioresCaches(){
        List<Cantor> cantoresRicos = new ArrayList<>();
        for (Cantor cantor : cantores) {
            if(cantor.getCache() > 10000.0){
                cantoresRicos.add(cantor);
            }
        }
        return cantoresRicos;
    }

    @PutMapping("/{id}")
    public Cantor putCantor(@RequestBody Cantor cantor,
                            @PathVariable int id){
        cantores.set(id, cantor);
        return cantor;
    }

    public List<Cantor> getCantores() {
        return cantores;
    }

    public void setCantores(List<Cantor> cantores) {
        this.cantores = cantores;
    }
}

