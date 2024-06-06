package aprendiendo.spring.jpa1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("alumno2")
public class AlumnoControlador2 {

    @Autowired
    AlumnoRepositorio2 alumnoRepositorio2;

    @GetMapping("/mayores")
    public List<AlumnoDTO> getAlumnosMayoresEdad()
    {
        List<AlumnoDTO> alunnos= alumnoRepositorio2.findByEdadGreaterThan(18);
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
