package com.example.api.expurgo.model;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

@Table
public class Diretorio {

    @Column
    private String name;
    @Column("diretorio-pai")
    private String diretorioPai;
    @Column
    private Integer tamanho;


    public String getName() {
        return name;
    }
    public String getDiretorioPai() {
        return diretorioPai;
    }
    public Integer getTamanho() {
        return tamanho;
    }

    
}
