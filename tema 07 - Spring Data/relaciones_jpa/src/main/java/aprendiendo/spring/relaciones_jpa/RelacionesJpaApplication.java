package aprendiendo.spring.relaciones_jpa;

import aprendiendo.spring.relaciones_jpa.entidades.Autor;
import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.repositorios.AutorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LibroRepository;
import aprendiendo.spring.relaciones_jpa.servicios.AutorService;
import aprendiendo.spring.relaciones_jpa.servicios.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RelacionesJpaApplication {




	public static void main(String[] args) {
		SpringApplication.run(RelacionesJpaApplication.class, args);
	}

	@Autowired
	AutorRepository autorRepository;
	@Autowired
	LibroRepository libroRepository;
	@Bean
	CommandLineRunner iniciar()
	{
		return (args) ->
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
		};
	}
}
