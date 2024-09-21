package com.Carpinteria.Carpinteria.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.Carpinteria.Carpinteria.Model.ProcesoEstadistico;

import java.util.List;

@RestController()
public class EstadisticasController {

    @GetMapping("/procesos")
    public List<Estadistica> obtenerEstadisticas() {
        ProcesoEstadistico proceso = Estadistica.generarProceso();
        return Estadistica.generarEstadisticas(proceso);
    }
}
