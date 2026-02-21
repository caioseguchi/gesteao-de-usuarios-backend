package com.devseguchi.backend.entity;

import com.devseguchi.backend.dto.PermissaoPerfilRecursoDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "cvs_permissao_perfil_recurso")
public class PermissaoPerfilRecursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private PerfilEntity perfil;

    @ManyToOne
    @JoinColumn(name = "id_recurso")
    private RecursoEntity recurso;

    public PermissaoPerfilRecursoEntity(PermissaoPerfilRecursoDTO permissaoPerfilRecurso){
        BeanUtils.copyProperties(permissaoPerfilRecurso,this);
        if (permissaoPerfilRecurso != null && permissaoPerfilRecurso.getRecurso() != null){
            this.recurso = new RecursoEntity(permissaoPerfilRecurso.getRecurso());
        }
        if (permissaoPerfilRecurso != null && permissaoPerfilRecurso.getPerfil() != null){
            this.perfil = new PerfilEntity(permissaoPerfilRecurso.getPerfil());
        }
    }

    public PermissaoPerfilRecursoEntity() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    public RecursoEntity getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoEntity recurso) {
        this.recurso = recurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissaoPerfilRecursoEntity that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
