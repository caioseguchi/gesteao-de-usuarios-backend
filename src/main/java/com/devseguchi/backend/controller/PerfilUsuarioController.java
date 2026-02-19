package com.devseguchi.backend.controller;

import com.devseguchi.backend.dto.PerfilUsuarioDTO;
import com.devseguchi.backend.service.PerfilUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil-usuario")
@CrossOrigin
public class PerfilUsuarioController {
    @Autowired
    PerfilUsuarioService perfilUsuarioService;

    @GetMapping
    public List<PerfilUsuarioDTO> listarTodos(){
        return  perfilUsuarioService.listarTodos();
    }
    @PostMapping
    public void inserir(@RequestBody PerfilUsuarioDTO perfilUsuario){
        perfilUsuarioService.inserir(perfilUsuario);
    }

    @PutMapping
    public PerfilUsuarioDTO alterar(@RequestBody PerfilUsuarioDTO perfilUsuario){
        return perfilUsuarioService.alterar(perfilUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        perfilUsuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
