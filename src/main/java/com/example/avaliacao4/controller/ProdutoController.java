package com.example.avaliacao4.controller;

import com.example.avaliacao4.model.Produto;
import com.example.avaliacao4.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    @RequestMapping(value = "", method = RequestMethod.GET, produces="application/json")
    public List<Produto> listaProdutos() {
        return (List<Produto>) repository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<?> cadastraProduto(@RequestBody Produto produto) {
        repository.save(produto);
        return new ResponseEntity<>(produto, null, 1);
    }

    @DeleteMapping("/{id}")
    void DeletarProduto(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    void DeletarTodosProdutos() {
        repository.deleteAll();
    }
}
