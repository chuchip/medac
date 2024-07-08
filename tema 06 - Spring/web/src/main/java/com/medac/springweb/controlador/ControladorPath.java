package com.medac.springweb.controlador;

import com.medac.springweb.dto.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController("path")
public class ControladorPath {

    @GetMapping("usuarios/{nombre}")
    public String saluda(@PathVariable String nombre)
    {
        return "Hola "+nombre;
    }
    @RequestMapping()
    public String miFuncion()
    {
        return "Bienvenido a Spring Boot";
    }
    @RequestMapping(value = "/usuarios", method = {RequestMethod.GET, RequestMethod.POST})
    public String getUsuarios()
    {
        return "Usuarios leidos...";
    }
    @GetMapping("/usuarios/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return new Usuario("Jesus","Madrid",30);
    }
    // Estas dos funciones son iguales
    @GetMapping("/usuarios2/{id}")
    public Usuario obtenerUsuarioPorId2(@PathVariable Long id) {
        return new Usuario("Jesus","Madrid",30);
    }

    @PostMapping("/usuarios/{nombre}/{ciudad}")
    public String saluda2(@PathVariable String nombre,@PathVariable String ciudad)
    {
        return "Hola "+nombre+ " de la ciudad: "+ciudad;
    }

}

