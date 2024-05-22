package aprendiendo.spring.jpa1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

}
