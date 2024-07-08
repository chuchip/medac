package com.medac.springweb.controlador;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param")
public class ControladorParam {

    @GetMapping
    public String saluda(@RequestParam String nombre)
    {
        return "Hola aquel cuyo nombre es "+nombre;
    }
    @GetMapping("/ciudad")
    public String saluda2(@RequestParam(name ="ciudad",required=false,defaultValue = "Madrid") String var1)
    {
        return "Hola aquel que vive en la ciudad "+var1;
    }

    @GetMapping("/profesion")
    public String saluda3(@RequestParam String profesion,@RequestParam(name ="ciudad",required=false,defaultValue = "Madrid") String var1)
    {
        return "Hola "+ profesion+ "  que vives en la ciudad "+var1;
    }
}

