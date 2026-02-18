package com.devseguchi.backend.controller;

import com.devseguchi.backend.dto.RecursoDTO;
import com.devseguchi.backend.entity.RecursoEntity;
import com.devseguchi.backend.service.RecursoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recurso")
@CrossOrigin
public class RecursoController {
    @Autowired
    private RecursoServer recursoServer;

    @GetMapping
    public List<RecursoDTO> listarTodos(){
        return recursoServer.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody RecursoDTO recurso){
        recursoServer.inserir(recurso);
    }

    @PutMapping
    public RecursoDTO alterar(@RequestBody RecursoDTO recurso){
        return recursoServer.alterar(recurso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        recursoServer.excluir(id);
        return ResponseEntity.ok().build();
    }
}

