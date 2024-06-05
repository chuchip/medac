package aprendiendo.spring.jpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Jpa1Application {

	@Autowired
	AlumnoRepositorio	 alumnoRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(Jpa1Application.class, args);
	}

	@Bean
	public CommandLineRunner inicializa()
	{
		return (args) -> {
			alumnoRepositorio.save(new AlumnoEntidad(0,"Jesus",15,"Informatica"));
			alumnoRepositorio.save(new AlumnoEntidad(0,"Maria",25,"Informatica Avanzada"));
			alumnoRepositorio.save(new AlumnoEntidad(0,"Luis",43,"Spring Boot"));
			alumnoRepositorio.save(new AlumnoEntidad(0,"Sofia",35,"Big Data"));
		};
	}
}
