package com.cur.semillero.semillerocur;

import com.cur.semillero.semillerocur.model.Estudiante;
import com.cur.semillero.semillerocur.repository.EstudianteRepository;
import com.cur.semillero.semillerocur.service.EstudianteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EstudianteServiceTest {

    @Mock
    private EstudianteRepository repository; // Aquí simulamos la base de datos

    @InjectMocks
    private EstudianteService service; // El servicio usará el simulador anterior

    @Test
    public void testGuardarEstudiante() {
        // 1. Preparamos el escenario (Simulación)
        Estudiante estudiante = new Estudiante(null, "Juan Perez", "Ingeniería", "juan@cur.edu.co");
        when(repository.save(estudiante)).thenReturn(estudiante);

        // 2. Ejecutamos la acción
        Estudiante guardado = service.guardar(estudiante);

        // 3. Verificamos los resultados (Puntos de la rúbrica)
        assertEquals("Juan Perez", guardado.getNombre());
    }
}