package com.example.api.expurgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.service.DiretorioService;

@RestController
@RequestMapping(path = "/listaPasta")
public class DiretorioController {

    @Autowired
    private DiretorioService diretorioService;

    @GetMapping(path = "/{caminhoDiretorio}")
    public ResponseEntity<List<Diretorio>> listarArquivos(@PathVariable String caminhoDiretorio) {
         
        List<Diretorio> arquivos = diretorioService.listarArquivosDaPasta(caminhoDiretorio);

        if (arquivos == null || arquivos.isEmpty()) {
            System.out.println("Está vazio!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok().body(arquivos);
    }
}
