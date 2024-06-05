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

//    @GetMapping("/nombre/{nombre}")
//    public List<AlumnoEntidad> getAlumnosPorNombre(@PathVariable String nombre)
//    {
//        List<AlumnoEntidad> alunnos= alumnoRepositorio.buscaPorNombre(nombre);
//        return alunnos;
//    }
//    @GetMapping("/nombre_edad/{nombre}")
//    public List<Double> getAlumnosPorNombreNativo(@PathVariable String nombre)
//    {
//        List<Double> alunnos= alumnoRepositorio.buscaPorNombreNative(nombre);
//        return alunnos;
//    }
    @GetMapping("/mayores")
    public List<AlumnoDTO> getAlumnosMayoresEdad()
    {
        List<AlumnoDTO> alunnos= alumnoRepositorio2.findByEdadGreaterThan18();
        return alunnos;
    }
}
