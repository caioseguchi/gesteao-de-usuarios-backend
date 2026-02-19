package com.devseguchi.backend.service;

import com.devseguchi.backend.dto.PerfilDTO;
import com.devseguchi.backend.dto.PerfilUsuarioDTO;
import com.devseguchi.backend.dto.RecursoDTO;
import com.devseguchi.backend.entity.PerfilEntity;
import com.devseguchi.backend.entity.PerfilUsuarioEntity;
import com.devseguchi.backend.entity.RecursoEntity;
import com.devseguchi.backend.repository.PerfilUsuarioRepository;
import com.devseguchi.backend.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilUsuarioService {
    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    public List<PerfilUsuarioDTO> listarTodos(){
        List<PerfilUsuarioEntity> recursos = perfilUsuarioRepository.findAll();
        return recursos.stream().map(PerfilUsuarioDTO::new).toList();
    }

    public void inserir(PerfilUsuarioDTO perfilUsuario){
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        perfilUsuarioRepository.save(perfilUsuarioEntity);
    }

    public PerfilUsuarioDTO alterar(PerfilUsuarioDTO perfilUsuario){
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        return new PerfilUsuarioDTO(perfilUsuarioRepository.save(perfilUsuarioEntity));
    }
    public void excluir(Long id){
        PerfilUsuarioEntity perfilUsuario = perfilUsuarioRepository.findById(id).get();
        perfilUsuarioRepository.delete(perfilUsuario);
    }
    public PerfilUsuarioDTO buscarPorId(Long id){
        return new PerfilUsuarioDTO(perfilUsuarioRepository.findById(id).get());
    }
}
