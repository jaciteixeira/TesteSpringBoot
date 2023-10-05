package com.example.api.expurgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.expurgo.model.DiretorioMonitorado;
import com.example.api.expurgo.repository.DiretorioMonitoradoRepository;

@RestController
@RequestMapping("/monitorado")
public class DiretorioMonitoradoController {

    @Autowired
    private DiretorioMonitoradoRepository monitoradoRepository;

    public List<DiretorioMonitorado> listAll(){
        return monitoradoRepository.findAll();
    }

}
