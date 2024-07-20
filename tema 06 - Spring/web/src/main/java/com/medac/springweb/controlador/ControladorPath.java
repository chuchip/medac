package com.medac.springweb.controlador;

import com.medac.springweb.dto.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorPath {

    @GetMapping("usuarios/nombre/{nombre}")
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

    /**
     * Obtener usuario por id
     * @param id
     * @return
     */
    @GetMapping("/usuarios/{id}{nombre}")
    public Usuario obtenerUsuarioPorId(@PathVariable("id") Long idh,@PathVariable String nombre) {
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

