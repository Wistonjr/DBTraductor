package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.repositories.IEscaneoRepository;
import com.example.dbtraductor.servicesinterfaces.IEscaneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscaneoServiceImplement implements IEscaneoService {
    @Autowired
    private IEscaneoRepository escaneoRepository;


    /**
     * Devuelve el lenguaje de programación con más escaneos.
     * Sirve para saber qué tipo de código se analiza más seguido para traducir.
     */
    public Object getMostScannedLanguage() {
        return escaneoRepository.findMostScannedLanguage();
    }

}
