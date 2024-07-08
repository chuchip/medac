package com.medac.springweb.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/respuesta")
public class ControladorResponse {

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @GetMapping("forbiden")
    public String saluda()
    {
        return "Devuelvo un status 403 - Forbiden";
    }

    @GetMapping("completo")
    public ResponseEntity<String> base()
    {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("cabecera1","valor de cabecera1")
                .body("Este es el cuerpo");
    }
}

