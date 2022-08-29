package com.example.apianime;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    private List<Anime> animes = new ArrayList();

    @PostMapping
    public Anime addAnime(@RequestBody Anime anime){
        anime.setId(animes.size() + 1);
        animes.add(anime);
        return anime;
    }

    @GetMapping("/{id}")
    public Anime getById(@PathVariable int id) {
        for (Anime anime : animes) {
            if (anime.getId() == id) {
                return anime;
            }
        }
        return null;
    }

    @GetMapping("/episodes")
    public List<Anime> getByEpisodes() {
        List<Anime> animeList = new ArrayList<Anime>();
        for (Anime anime : animes) {
            if (anime.getEpisodes() > 200) {
                animeList.add(anime);
            }
        }
        return animeList;
    }

    @PutMapping("/{id}")
    public String updateAnime(@RequestBody Anime animeUpate,
                              @PathVariable int id) {
        for (Anime anime : animes) {
            if(anime.getId() == id) {
                anime.setDuration(animeUpate.getDuration());
                anime.setEpisodes(animeUpate.getEpisodes());
                anime.setName(animeUpate.getName());
                anime.setSubtitled(animeUpate.isSubtitled());
                return "Anime atualizado com sucesso";
            }
        }
        return "Nenhum anime foi encontrado";
    }

    @DeleteMapping("/{id}")
    public String removeAnime(@PathVariable int id) {
        for (Anime anime : animes) {
            if (anime.getId() == id) {
                animes.remove(anime);
                return "Anime removido com sucesso";
            }
        }
        return "Nenhum anime foi encontrado";
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(List<Anime> animes) {
        this.animes = animes;
    }
}
