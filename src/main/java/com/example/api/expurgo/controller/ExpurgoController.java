package com.example.api.expurgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.service.ExpurgoService;

@RestController
@RequestMapping(path = "/listaPastas")
public class ExpurgoController {

    @Autowired
    private ExpurgoService expurgoService;

    @GetMapping(path = "/{caminhoDiretorio}")
    public ResponseEntity<List<Diretorio>> listarArquivos(@PathVariable String caminhoDiretorio) {
        
        List<Diretorio> arquivos = expurgoService.listarArquivosDaPasta(caminhoDiretorio);

        if(arquivos.isEmpty()){
            System.out.println("Esta vazio!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        return ResponseEntity.ok().body(arquivos);
    }
}
