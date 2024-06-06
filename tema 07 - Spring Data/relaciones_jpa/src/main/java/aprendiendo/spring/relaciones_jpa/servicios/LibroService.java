package aprendiendo.spring.relaciones_jpa.servicios;

import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public Libro addLibro(Libro libro)
    {
        libroRepository.save(libro);
        return libro;
    }
}
