package com.example.api.expurgo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        try {
            // Decodifica o caminho do diretório
            String caminhoDecodificado = URLDecoder.decode(caminhoDiretorio, "UTF-8");

            // Chama o serviço com o caminho decodificado
            List<Diretorio> arquivos = expurgoService.listarArquivosDaPasta(caminhoDecodificado);

            if (arquivos == null || arquivos.isEmpty()) {
                System.out.println("Está vazio!");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }

            return ResponseEntity.ok().body(arquivos);
        } catch (UnsupportedEncodingException e) {
            // Lida com a exceção de codificação não suportada
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }  
    }
}
