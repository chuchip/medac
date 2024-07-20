package aprendiendo.spring.jpa1.controller;


import aprendiendo.spring.jpa1.dto.AlumnoDTO;
import aprendiendo.spring.jpa1.entity.AlumnoEntidad;
import aprendiendo.spring.jpa1.repository.AlumnoRepositorio2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumno2")
public class AlumnoControlador2 {

    @Autowired
    AlumnoRepositorio2 alumnoRepositorio2;

    @GetMapping("/mayores")
    public List<AlumnoEntidad> getAlumnosMayoresEdad()
    {
        List<AlumnoEntidad> alunnos= alumnoRepositorio2.findByEdadGreaterThan(18);
        return alunnos;
    }
    @GetMapping("/nombre")
    public List<AlumnoEntidad> getAlumnosPorNombre(@RequestParam String nombre)
    {
        List<AlumnoEntidad> alunnos= alumnoRepositorio2.findByNombre(nombre);
        return alunnos;
    }
    @GetMapping("/mayores/{edad}")
    public List<AlumnoEntidad> getAlumnosMayoresDe(@PathVariable int edad)
    {
        List<AlumnoEntidad> alunnos= alumnoRepositorio2.findByEdadGreaterThanEqualOrderByEdadDesc(edad);
        return alunnos;
    }
}
