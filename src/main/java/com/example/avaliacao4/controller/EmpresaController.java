package com.example.avaliacao4.controller;

import com.example.avaliacao4.model.Empresa;
import com.example.avaliacao4.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    @GetMapping
    @RequestMapping(value = "", method = RequestMethod.GET, produces="application/json")
    public List<Empresa> listaEmpresas() {
        return (List<Empresa>) repository.findAll();
    }
    

    @PostMapping("")
    public ResponseEntity<?> cadastraEmpresa (@RequestBody Empresa empresa) {
        repository.save(empresa);
        return new ResponseEntity<>(empresa, null, 1);
    }

    @DeleteMapping("/{id}")
    void DeletarEmpresa(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    void DeletarTodosEmpresas() {
        repository.deleteAll();
    }
}
