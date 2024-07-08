package com.medac.springweb.controlador;

import com.medac.springweb.servicio.ServicioCalcular;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculo")
public class ControladorServicio {
    final ServicioCalcular servicioCalcular;

    public ControladorServicio(ServicioCalcular servicioCalcular) {
        this.servicioCalcular = servicioCalcular;
    }

    /**
     * Ejemplo curl "http://localhost:8080/calculo?numero1=5&numero2=10"
     * @param numero1
     * @param numero2
     * @return
     */
    @GetMapping
    public double calcula(@RequestParam int numero1, @RequestParam int numero2)
    {
        return servicioCalcular.calculoCompliado(numero1,numero2);
    }
}

