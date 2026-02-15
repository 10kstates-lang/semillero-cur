package com.cur.semillero.semilleroservice.controller;

import com.cur.semillero.semilleroservice.model.Semillero;
import com.cur.semillero.semilleroservice.repository.SemilleroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/semilleros")
public class SemilleroController {

    @Autowired
    private SemilleroRepository semilleroRepository;

    // Este método devolverá la lista de semilleros en formato JSON
    @GetMapping
    public List<Semillero> obtenerTodos() {
        return semilleroRepository.findAll();
    }
}