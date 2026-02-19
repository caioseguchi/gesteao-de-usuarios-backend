package com.devseguchi.backend.entity;

import com.devseguchi.backend.dto.PerfilDTO;
import com.devseguchi.backend.dto.PerfilUsuarioDTO;
import com.devseguchi.backend.dto.UsuarioDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "cvc_perfilusuario")
public class PerfilUsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private PerfilEntity perfil;

    public PerfilUsuarioEntity(PerfilUsuarioDTO perfilUsuario){
        BeanUtils.copyProperties(perfilUsuario,this);
        if (perfilUsuario != null && perfilUsuario.getUsuario() != null){
            this.usuario = new UsuarioEntity(perfilUsuario.getUsuario());
        }
        if (perfilUsuario != null && perfilUsuario.getPerfil() != null){
            this.perfil = new PerfilEntity(perfilUsuario.getPerfil());
        }
    }

    public PerfilUsuarioEntity(){};


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerfilUsuarioEntity that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
