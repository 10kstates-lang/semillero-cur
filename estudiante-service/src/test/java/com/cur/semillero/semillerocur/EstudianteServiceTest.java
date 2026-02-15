package com.cur.semillero.semillerocur;

import com.cur.semillero.semillerocur.model.Estudiante;
import com.cur.semillero.semillerocur.repository.EstudianteRepository;
import com.cur.semillero.semillerocur.service.EstudianteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// Cambiamos los imports para usar las verificaciones de Mockito
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class EstudianteServiceTest {

    @Mock
    private EstudianteRepository repository;

    @InjectMocks
    private EstudianteService service;

    @Test
    public void testGuardarEstudiante() {

        // 1. Preparamos los datos del estudiante con el formato moderno (incluyendo semilleroId)
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan Perez");
        estudiante.setPrograma("Ingeniería");
        estudiante.setCorreo("juan@cur.edu.co");
        estudiante.setSemilleroId(1L); // ¡El campo nuevo!

        // 2. Ejecutamos el servicio (como ahora es 'void', no lo guardamos en ninguna variable)
        service.guardar(estudiante);

        // 3. Afirmamos que el repositorio intentó guardar este estudiante exactamente 1 vez
        verify(repository, times(1)).save(estudiante);
    }
}