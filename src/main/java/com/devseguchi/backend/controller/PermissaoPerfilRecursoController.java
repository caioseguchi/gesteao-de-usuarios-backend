package com.devseguchi.backend.controller;

import com.devseguchi.backend.dto.PermissaoPerfilRecursoDTO;
import com.devseguchi.backend.service.PermissaoPerfilRecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/permissao-perfil-recurso")
@CrossOrigin
public class PermissaoPerfilRecursoController {

    @Autowired
    PermissaoPerfilRecursoService permissaoPerfilRecursoService;

    @GetMapping
    public List<PermissaoPerfilRecursoDTO> listarTodos(){
        return permissaoPerfilRecursoService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody PermissaoPerfilRecursoDTO permissaoPerfilRecurso){
        permissaoPerfilRecursoService.inserir(permissaoPerfilRecurso);
    }

    @PutMapping
    public PermissaoPerfilRecursoDTO alterar(@RequestBody PermissaoPerfilRecursoDTO permissaoPerfilRecurso){
        return permissaoPerfilRecursoService.alterar(permissaoPerfilRecurso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exlcuir(@PathVariable Long id){
        permissaoPerfilRecursoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
