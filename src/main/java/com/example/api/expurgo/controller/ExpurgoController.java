package com.example.api.expurgo.controller;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.service.ExpurgoService;

@RestController("/listarPastas")
public class ExpurgoController {

    private final ExpurgoService testeService;

    public ExpurgoController(ExpurgoService expurgoService) {
        this.testeService = expurgoService;
    }

    @GetMapping(path = "/{caminhoDiretorio}")
    public List<Diretorio> listarPastas(@PathVariable("caminhoDiretorio") String caminhoDiretorio) {
        List<Diretorio> arquivos = testeService.listarArquivosDaPasta(caminhoDiretorio);

        // Converte os arquivos em objetos Diretorio
        List<Diretorio> diretorios = arquivos.stream()
                .map(arquivo -> new Diretorio())
                .collect(Collectors.toList());

        return diretorios;
    }
}
