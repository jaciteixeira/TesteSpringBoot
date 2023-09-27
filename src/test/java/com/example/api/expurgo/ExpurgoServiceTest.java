package com.example.api.expurgo;

import java.util.List;

import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.service.ExpurgoService;

public class ExpurgoServiceTest {
    public static void main(String[] args) {
        ExpurgoService expurgoService = new ExpurgoService();
        List<Diretorio> arquivos = expurgoService.listarArquivosDaPasta("/C:");

        for(Diretorio arquivo : arquivos){
            System.out.println(arquivo.getName());
        }
    }
}
