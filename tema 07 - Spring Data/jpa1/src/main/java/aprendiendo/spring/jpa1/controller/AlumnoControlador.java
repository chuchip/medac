package aprendiendo.spring.jpa1.controller;


import aprendiendo.spring.jpa1.dto.AlumnoDTO;
import aprendiendo.spring.jpa1.entity.AlumnoEntidad;
import aprendiendo.spring.jpa1.repository.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("alumno")
public class AlumnoControlador {
    @Autowired
    AlumnoRepositorio alumnoRepositorio;

    @PostMapping
    public AlumnoEntidad insertarAlumno(@RequestBody AlumnoEntidad alumnoEntidad)
    {
        return alumnoRepositorio.save(alumnoEntidad);
    }

    @GetMapping
    public List<AlumnoEntidad> getAlumnos()
    {
        return alumnoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlumnoEntidad> getAlumno(@PathVariable int id)
    {
        Optional<AlumnoEntidad> alunno= alumnoRepositorio.findById(id);

        if (alunno.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(alunno.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarAlumno(@PathVariable int id)
    {
        Optional<AlumnoEntidad> alunno= alumnoRepositorio.findById(id);

        if (alunno.isEmpty())
            return ResponseEntity.notFound().build();
        alumnoRepositorio.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping( "/{id}")
    public ResponseEntity<AlumnoEntidad> actualizarAlumno(@PathVariable int id,@RequestBody AlumnoEntidad alumnoEntidad)
    {
        Optional<AlumnoEntidad> alunno= alumnoRepositorio.findById(id);

        if (alunno.isEmpty())
            return ResponseEntity.notFound().build();
        alumnoEntidad.setId(id);

        return ResponseEntity.ok(alumnoRepositorio.save(alumnoEntidad));
    }

    @GetMapping("/nombre/{nombre}")
    public List<AlumnoEntidad> getAlumnosPorNombre(@PathVariable String nombre)
    {
        List<AlumnoEntidad> alunnos= alumnoRepositorio.buscaPorNombre(nombre);
        return alunnos;
    }
    @GetMapping("/nombre_edad/{nombre}")
    public List<Double> getAlumnosPorNombreNativo(@PathVariable String nombre)
    {
        List<Double> alunnos= alumnoRepositorio.buscaPorNombreNative(nombre);
        return alunnos;
    }
    @GetMapping("/mayores")
    public List<AlumnoDTO> getAlumnosMayoresEdad()
    {
        List<AlumnoDTO> alunnos= alumnoRepositorio.buscaMayoresDeEdad();
        return alunnos;
    }
}
