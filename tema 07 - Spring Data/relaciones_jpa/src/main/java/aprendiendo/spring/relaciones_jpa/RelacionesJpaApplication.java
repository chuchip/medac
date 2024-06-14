package aprendiendo.spring.relaciones_jpa;

import aprendiendo.spring.relaciones_jpa.entidades.Autor;
import aprendiendo.spring.relaciones_jpa.entidades.Lector;
import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.entidades.Opinion;
import aprendiendo.spring.relaciones_jpa.repositorios.AutorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LectorRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.LibroRepository;
import aprendiendo.spring.relaciones_jpa.repositorios.OpinionRepository;
import aprendiendo.spring.relaciones_jpa.servicios.AutorService;
import aprendiendo.spring.relaciones_jpa.servicios.LibroService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RelacionesJpaApplication {

	@Autowired
	AutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(RelacionesJpaApplication.class, args);
	}


	@Bean
	CommandLineRunner iniciar()
	{
		return (args) ->
		{
			Lector lector =autorService.insertar();
			autorService.leer(lector);
		};
	}
}
