package aprendiendo.spring.relaciones_jpa.servicios;

import aprendiendo.spring.relaciones_jpa.entidades.Autor;
import aprendiendo.spring.relaciones_jpa.entidades.Lector;
import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.entidades.Opinion;
import aprendiendo.spring.relaciones_jpa.repositorios.AutorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LectorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LibroRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    @Autowired
    LibroRepository libroRepository;

    @Autowired
    LectorRepository lectorepository;
    @Autowired
    OpinionRepository opinionRepository;
    public Autor addAutor(Autor autor)
    {
        autorRepository.save(autor);
        return autor;
    }
    @Transactional(readOnly = true)
    public void leer(Lector lector)
    {
        lector =lectorepository.findById(lector.getId()).orElseThrow( () -> new RuntimeException("Lector no encontrado"));
        System.out.println("----------------------------------------- ");
        System.out.println("Lector: ");
        System.out.println(lector);
    }
    @Transactional
    public Lector insertar()
    {
        Libro libro=addAutorYLibro();
        Lector lector= addLectorOpinion(libro);
        return lector;
    }
    Libro addAutorYLibro()
    {
        Autor autor= new Autor();
        autor.setNombre("Jesús");
        autor.setApellido("Perez");
        Libro libro=new Libro();
        libro.setTitulo("Libro de Pepe");
        libro.setGenero("Autobiografia");

        autor.setLibro(libro);
        libro.setAutor(autor);
        autorRepository.save(autor);
        libroRepository.save(libro);
        return libro;
    }
    Lector addLectorOpinion(Libro libro)
    {
        Lector lector= new Lector();
        lector.setNombre("Martin");
        Opinion opinion= new Opinion();
        opinion.setLector(lector);
        opinion.setLibro(libro);
        opinion.setNota(5);

        Opinion opinion2= new Opinion();
        opinion2.setLector(lector);
        opinion2.setLibro(libro);
        opinion2.setNota(6);
        List<Opinion> opinionList= List.of(opinion,opinion2);
        lector.setOpinionList(opinionList);

        lectorepository.save(lector);
        opinionRepository.saveAll(opinionList);
        return lector;
    }
}
