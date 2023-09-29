package com.example.api.expurgo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.service.ExpurgoService;

@TestInstance(Lifecycle.PER_CLASS)
public class ExpurgoServiceTest {

    @InjectMocks
    ExpurgoService expurgoService;

    void beforeAll(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveriaListarInformacoesDaPasta(){
        List<Diretorio> lista = expurgoService.listarArquivosDaPasta("/C:");
        for(Diretorio arquivo : lista){
            System.out.println(arquivo.getName());
        }
    }

    @Test
    void deveriaRetornarIllegalArgumentExcept(){
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
