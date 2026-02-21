package com.devseguchi.backend.dto;

import com.devseguchi.backend.entity.PerfilEntity;
import com.devseguchi.backend.entity.PermissaoPerfilRecursoEntity;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class PermissaoPerfilRecursoDTO {
    private Long id;
    private PerfilDTO perfil;
    private RecursoDTO recurso;

    public PermissaoPerfilRecursoDTO(PermissaoPerfilRecursoEntity permissaoPerfilRecurso){
        BeanUtils.copyProperties(permissaoPerfilRecurso, this);
        if (permissaoPerfilRecurso != null && permissaoPerfilRecurso.getRecurso() != null){
            this.recurso = new RecursoDTO(permissaoPerfilRecurso.getRecurso());
        }
        if (permissaoPerfilRecurso != null && permissaoPerfilRecurso.getPerfil() != null){
            this.perfil = new PerfilDTO(permissaoPerfilRecurso.getPerfil());
        }
    }

    public PermissaoPerfilRecursoDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilDTO perfil) {
        this.perfil = perfil;
    }

    public RecursoDTO getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoDTO recurso) {
        this.recurso = recurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissaoPerfilRecursoDTO that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
