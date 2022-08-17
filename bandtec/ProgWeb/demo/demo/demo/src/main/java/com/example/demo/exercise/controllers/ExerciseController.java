package com.example.demo.exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @GetMapping("/pode-votar/{idade}")
    public boolean canVote(@PathVariable int idade){
        boolean vote = idade > 16 ? vote = true : false;
        return vote;
    }

    @GetMapping("/imc/{peso}/{altura}")
    public Double imc(@PathVariable Double peso, @PathVariable Double altura){
        return peso / (Math.pow(altura, 2));
    }

    @GetMapping("analise-campanha/{vit}/{emp}/{derr}")
    public String camp(@PathVariable int vit, @PathVariable int emp, @PathVariable int derr){
        int total = (vit * 3) + (emp);
        int pp = (vit + emp + derr) * 3;
        double result = (double)total/pp * 100;
        return "A campanha do time foi de " +result+ "%";
    }

}
