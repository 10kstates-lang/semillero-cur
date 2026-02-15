package com.cur.semillero.semillerocur.service;

import com.cur.semillero.semillerocur.model.Estudiante;
import com.cur.semillero.semillerocur.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public List<Estudiante> listarTodos() {
        return repository.findAll();
    }

    // Método para guardar en la base de datos
    public void guardar(Estudiante estudiante) {
        repository.save(estudiante);
    }
}