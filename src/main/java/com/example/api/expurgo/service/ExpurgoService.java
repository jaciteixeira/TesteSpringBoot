package com.example.api.expurgo.service;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.api.expurgo.model.Diretorio;

@Service
public class ExpurgoService {
    
    public List<Diretorio> listarArquivosDaPasta(String caminhoDiretorio) {
        Assert.notNull(caminhoDiretorio, "O caminho do diretório está nulo!");

        File diretorio = new File(caminhoDiretorio);
        
        if (!diretorio.exists() || !diretorio.isDirectory()) {
            throw new IllegalArgumentException("O caminho especificado não é um diretório válido.");
        }

        File[] arquivos = diretorio.listFiles();

        for(arquivo : arquivos){
            
        }

        if (arquivos != null) {
            return Arrays.asList(arquivos);
        } else {
            return null; // ou uma lista vazia, dependendo do seu caso de uso
        }
    }
}

