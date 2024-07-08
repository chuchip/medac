package com.medac.springweb.controlador;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/body")
public class ControladorBody {

    @PostMapping
    public String saluda(@RequestBody String nombre)
    {
        return "Hola aquel cuyo nombre es "+nombre;
    }

    @GetMapping
    public String base()
    {
        return "en ControladorBody";
    }
}

