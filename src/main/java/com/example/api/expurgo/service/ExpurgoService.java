package com.example.api.expurgo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.api.expurgo.model.Diretorio;

@Service
public class ExpurgoService {
    
    public List<Diretorio> listarArquivosDaPasta(String caminhoDiretorio) {
        Assert.notNull(caminhoDiretorio, "O caminho do diretório está nulo!");
        List<Diretorio> conteudo = new ArrayList<>();

        File pasta = new File(caminhoDiretorio);
        if (pasta.exists() && pasta.isDirectory()) {

            File[] arquivos = pasta.listFiles();
    
            for(File arquivo : arquivos){
                Diretorio diretorio = new Diretorio();
                diretorio.setDiretorio(arquivo.isDirectory());
                diretorio.setDiretorioPai(arquivo.getParent());
                diretorio.setName(arquivo.getName());
                diretorio.setTamanho(arquivo.length());

                conteudo.add(diretorio);
                
            }
        }
        return conteudo;

    }
}

