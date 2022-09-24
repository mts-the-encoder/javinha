package com.mts.products.controller;

import com.mts.products.entity.Produto;
import com.mts.products.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> saveProduto(@RequestBody Produto produto) {
        if (produto.getNome().length() > 2 && produto.getPrecoUnitario() >= 0.01
                && produto.getQtdEstoque() > 1) {
            Produto prod = produtoRepository.save(produto);
            return ResponseEntity.status(201).body(prod);
        }
        return ResponseEntity.status(400).build();
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getUsuarios() {
        List<Produto> produtos = produtoRepository.findAll();

        if(produtos.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(produtos);
    }

    @DeleteMapping("{posicao}")
    public ResponseEntity<Produto> remove(@PathVariable Integer posicao) {
        if (this.produtoRepository.existsById(posicao)) {
            this.produtoRepository.deleteById(posicao);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }


}
