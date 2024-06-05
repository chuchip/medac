package aprendiendo.spring.jpa1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepositorio2 extends JpaRepository<AlumnoEntidad,Integer> {

    List<AlumnoDTO> findByEdadGreaterThan18();

}
