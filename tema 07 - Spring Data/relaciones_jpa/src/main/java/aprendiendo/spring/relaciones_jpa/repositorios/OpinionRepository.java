package aprendiendo.spring.relaciones_jpa.repositorios;

import aprendiendo.spring.relaciones_jpa.entidades.Libro;
import aprendiendo.spring.relaciones_jpa.entidades.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionRepository extends JpaRepository<Opinion,Long> {
}
