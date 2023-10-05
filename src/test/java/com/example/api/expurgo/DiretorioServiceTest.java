package com.example.api.expurgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.example.api.expurgo.controller.DiretorioMonitoradoController;
import com.example.api.expurgo.model.Diretorio;
import com.example.api.expurgo.model.DiretorioMonitorado;
import com.example.api.expurgo.service.DiretorioService;



@TestInstance(Lifecycle.PER_CLASS)
public class DiretorioServiceTest {

    @InjectMocks
    DiretorioService diretorioService;
    @InjectMocks
    DiretorioMonitoradoController monitoradoController;

    @BeforeAll
    void beforeAll(){
        MockitoAnnotations.openMocks(this);
    }

    // @Test
    // void deveriaListarInformacoesDaPasta(){
    //     List<Diretorio> lista = diretorioService.listarArquivosDaPasta("/C:");
    //     for(Diretorio arquivo : lista){
    //         System.out.println(arquivo.getName());
    //     }
    // }

    @Test
    void deveriaRetornarIllegalArgumentExceptNoListarArquivosDaPasta(){
        try {
            diretorioService.listarArquivosDaPasta(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);

        }
    }

    @Test
    void deveriaRetonarListadeDiretorioEmListarArquivosDaPasta(){
        List<Diretorio> lista = diretorioService.listarArquivosDaPasta("/C:");
        assertTrue(!lista.isEmpty());
    }

    @Test
    void deveriaRetornarListadeDiretorioEmListAll() {
        List<DiretorioMonitorado> lista = monitoradoController.listAll();
        assertTrue(!lista.isEmpty());
    }

    
}