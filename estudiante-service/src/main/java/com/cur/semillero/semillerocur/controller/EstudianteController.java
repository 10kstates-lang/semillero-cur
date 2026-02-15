package com.cur.semillero.semillerocur.controller;

import com.cur.semillero.semillerocur.model.Estudiante;
import com.cur.semillero.semillerocur.service.EstudianteService;
import com.cur.semillero.semillerocur.service.SemilleroClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @Autowired
    private SemilleroClientService semilleroClientService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("estudiantes", service.listarTodos());
        model.addAttribute("semilleros", semilleroClientService.obtenerTodosLosSemilleros());
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("semilleros", semilleroClientService.obtenerTodosLosSemilleros());
        return "nuevo";
    }

    // Atrapa los datos del formulario y los guarda
    @PostMapping("/nuevo")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        service.guardar(estudiante);
        return "redirect:/";
    }
}