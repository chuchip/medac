package aprendiendo.spring.jpa1.repository;

import aprendiendo.spring.jpa1.entity.AlumnoEntidad;
import aprendiendo.spring.jpa1.dto.AlumnoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepositorio2 extends JpaRepository<AlumnoEntidad,Integer> {

    List<AlumnoEntidad> findByEdadGreaterThan(int edad);

    List <AlumnoEntidad> findByNombre(String nombre);

    List<AlumnoEntidad> findByEdadGreaterThanEqualOrderByEdadDesc(int edad);
}
