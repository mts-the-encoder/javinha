package com.mts.apilutadores;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class FighterController {

    private List<Fighter> fighters = new ArrayList<Fighter>();

    @PostMapping
    public Fighter addFighter(@RequestBody Fighter fighter) {
        fighters.add(fighter);
        return fighter;
    }

    @GetMapping
    public List<Fighter> getFighters() {
        return fighters;
    }

    @PatchMapping("/{posicaoBate}/golpe/{posicaoApanha}")
    public List<Fighter> fight(@PathVariable int posicaoBate, @PathVariable int posicaoApanha) {
        List<Fighter> fight = new ArrayList();
        for (int i = 0; i < fighters.size(); i++) {
            for (int j = 0; j < fighters.size(); j++) {
                if (i == posicaoBate && j == posicaoApanha) {
                    fight.add(fighters.get(i));
                    fight.add(fighters.get(j));
                    int life = fight.get(j).getVida() - (fighters.get(i).getForcaGolpe() - fight.get(j).getForcaDefesa());
                    fighters.get(j).setVida(life);
                    if (fighters.get(j).getVida() < 0) {
                        fighters.get(j).setVida(0);
                    }
                }
            }
        }
        return fight;
    }

    @GetMapping("/sobreviventes")
    public List<Fighter> getSurviversFighters() {
        List<Fighter> surviers = new ArrayList<Fighter>();
        for (Fighter f : fighters) {
            if (f.getVida() >0) {
                surviers.add(f);
            }
        }
        return surviers;
    }
}
