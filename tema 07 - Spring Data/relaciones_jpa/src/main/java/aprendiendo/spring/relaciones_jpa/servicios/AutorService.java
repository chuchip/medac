package aprendiendo.spring.relaciones_jpa.servicios;

import aprendiendo.spring.relaciones_jpa.entidades.Autor;
import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.repositorios.AutorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    public Autor addAutor(Autor autor)
    {
        autorRepository.save(autor);
        return autor;
    }
}
