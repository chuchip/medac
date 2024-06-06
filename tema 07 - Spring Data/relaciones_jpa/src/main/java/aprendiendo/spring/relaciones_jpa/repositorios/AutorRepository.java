package aprendiendo.spring.relaciones_jpa.repositorios;

import aprendiendo.spring.relaciones_jpa.entidades.Autor;
import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
