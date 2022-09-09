package com.mts.grifes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/marcas")
public class BrandController {

    private List<Brand> brands = new ArrayList<>();

    @PostMapping
    public Brand addBrand(@RequestBody Brand brand) {
        brands.add(brand);
        return brand;
    }

    @GetMapping
    public List<Brand> getAllBrands() {
        return brands;
    }

    @PutMapping("/{index}")
    public Brand updateBrand(@PathVariable int index, @RequestBody Brand newBrand) {
        for (int i = 0; i < brands.size(); i++) {
            if(index == i) {
                brands.get(i).setNome(newBrand.getNome());
                brands.get(i).setAnoCriacao(newBrand.getAnoCriacao());
                brands.get(i).setValorAcaoBolsa(newBrand.getValorAcaoBolsa());
                return brands.get(i);
            }
        }
        return null;
    }

    @DeleteMapping("/{index}")
    public String removeBrand(@PathVariable int index) {
        for (int i = 0; i < brands.size(); i++) {
            if(i == index) {
                brands.remove(brands.get(i));
                return "Grife Excluída";
            }
        }
        return "Não encontrada";
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
