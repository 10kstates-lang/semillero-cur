package com.cur.semillero.semillerocur.controller;

import com.cur.semillero.semillerocur.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("estudiantes", service.listarTodos());
        return "index";
    }
}