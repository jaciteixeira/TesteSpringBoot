package com.example.testes.teste.controller;

import com.example.testes.teste.model.Diretorio;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/listarPastas") 
public class TesteController {

    @GetMapping
    public List<Diretorio> listarPastas(){
        return 


    }
}
