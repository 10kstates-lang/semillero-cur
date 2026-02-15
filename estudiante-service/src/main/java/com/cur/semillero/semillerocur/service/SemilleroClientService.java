package com.cur.semillero.semillerocur.service;

import com.cur.semillero.semillerocur.dto.SemilleroDTO;import com.cur.semillero.semillerocur.dto.SemilleroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class SemilleroClientService {

    @Autowired
    private RestTemplate restTemplate;

    // La URL de tu otro microservicio
    private final String SEMILLERO_SERVICE_URL = "http://localhost:8081/api/semilleros";

    public List<SemilleroDTO> obtenerTodosLosSemilleros() {
        // Hacemos un GET a la URL y convertimos el JSON en un arreglo de SemilleroDTO
        SemilleroDTO[] semillerosArray = restTemplate.getForObject(SEMILLERO_SERVICE_URL, SemilleroDTO[].class);

        // Lo convertimos a una Lista normal de Java y lo devolvemos
        return Arrays.asList(semillerosArray);
    }
}