package com.example.api.expurgo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.expurgo.model.DiretorioMonitorado;

@Repository
public interface DiretorioMonitoradoRepository extends JpaRepository<DiretorioMonitorado,Long> {
    
}
