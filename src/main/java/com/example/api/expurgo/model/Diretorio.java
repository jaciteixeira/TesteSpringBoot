package com.example.api.expurgo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Diretorio {

    @Column
    @Id
    private String name;
    @Column("diretorio-pai")
    private String diretorioPai;
    @Column
    private boolean diretorio;
    @Column
    private Long tamanho;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiretorioPai() {
        return diretorioPai;
    }
    public void setDiretorioPai(String diretorioPai) {
        this.diretorioPai = diretorioPai;
    }
    public boolean isDiretorio() {
        return diretorio;
    }
    public void setDiretorio(boolean diretorio) {
        this.diretorio = diretorio;
    }
    public Long getTamanho() {
        return tamanho;
    }
    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

}
