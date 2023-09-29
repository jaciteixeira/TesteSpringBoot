package com.example.api.expurgo.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Diretorio {

    @Id
    @Column
    private String name;
    @Column
    private String diretorioPai;
    @Column
    private boolean diretorio;
    @Column
    private Long tamanho;

    public Diretorio(File arquivo){
        diretorio = arquivo.isDirectory();
        diretorioPai = arquivo.getParent();
        name = arquivo.getName();
        tamanho = arquivo.length();
    }
}
