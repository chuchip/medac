package aprendiendo.spring.jpa1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<AlumnoEntidad,Integer> {
}
