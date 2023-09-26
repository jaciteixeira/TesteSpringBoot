package com.example.testes.teste.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class TesteService {

    public List<File> listarArquivosDaPasta(String caminhoDiretorio) {
        Assert.notNull(caminhoDiretorio, "O caminho do diretório está nulo!");

        @Autowired
        File diretorio(Diretorio caminhoDiretorio);
        
        if (!diretorio.exists() || !diretorio.isDirectory()) {
            throw new IllegalArgumentException("O caminho especificado não é um diretório válido.");
        }

        File[] arquivos = diretorio.listFiles();

        if (arquivos != null) {
            return Arrays.asList(arquivos);
        } else {
            return null; // ou uma lista vazia, dependendo do seu caso de uso
        }
    }
}

