package aprendiendo.spring.jpa1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepositorio2 extends JpaRepository<AlumnoEntidad,Integer> {

    List<AlumnoDTO> findByEdadGreaterThan(int edad);

    List <AlumnoEntidad> findByNombre(String nombre);

    List<AlumnoEntidad> findByEdadGreaterThanEqualOrderByEdadDesc(int edad);
}
