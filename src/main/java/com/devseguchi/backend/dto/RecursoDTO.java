package com.devseguchi.backend.dto;

import com.devseguchi.backend.entity.RecursoEntity;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class RecursoDTO {
    private Long id;
    private String nome;
    private String chave;

    //Constructors
    public RecursoDTO(){

    }

    public RecursoDTO(RecursoEntity recurso){
        BeanUtils.copyProperties(recurso,this);
    }

    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}
