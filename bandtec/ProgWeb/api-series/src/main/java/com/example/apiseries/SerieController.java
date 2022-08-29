package com.example.apiseries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    private List<Serie> series = new ArrayList();

    @PostMapping
    public Serie addSerie(@RequestBody Serie serie) {
        series.add(serie);
        return serie;
    }

    @JsonIgnore
    @GetMapping("/names/{name}")
    public Serie getByName(@PathVariable String name) {
        for (Serie serie : series) {
            if (serie.getName().equals(name)) {
                return serie;
            }
        }
        return null;
    }

    @JsonIgnore
    @GetMapping("/genders/{gender}")
    public List<Serie> getByGender(@PathVariable String gender) {
        List<Serie> serieList = new ArrayList<>();
        for (Serie serie : series) {
            if (serie.getGender().equals(gender)) {
                serieList.add(serie);
            }
        }
        return serieList;
    }

    @JsonIgnore
    @GetMapping("/{id}")
    public Serie getById(@PathVariable int id) {
        for (Serie serie : series) {
            if (serie.getId() == id) {
                return serie;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Serie updateSerie(@RequestBody Serie serie,
                             @PathVariable int id) {
        series.set(id, serie);
        return serie;

    }

    @DeleteMapping("/{id}")
    public String deleteSerie(@PathVariable int id) {
        for (Serie serie : series) {
            if (serie.getId() == id) {
                series.remove(serie);
            }
        }
        return "Série removida com sucesso";
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
}
