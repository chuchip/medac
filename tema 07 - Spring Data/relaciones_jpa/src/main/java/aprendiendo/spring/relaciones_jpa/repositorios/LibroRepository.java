package aprendiendo.spring.relaciones_jpa.repositorios;

import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {
}
