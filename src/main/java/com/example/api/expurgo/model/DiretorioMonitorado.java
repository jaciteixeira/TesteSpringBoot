package com.example.api.expurgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "diretorio_monitorado")
public class DiretorioMonitorado {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "diretorio_monitorado")
    @SequenceGenerator(name = "sequencia" , sequenceName = "sequencia")
    private Long id;
    @Column(name = "nome")
    private String nome;

}
