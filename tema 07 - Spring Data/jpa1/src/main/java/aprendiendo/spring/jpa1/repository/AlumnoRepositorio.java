package aprendiendo.spring.jpa1.repository;

import aprendiendo.spring.jpa1.entity.AlumnoEntidad;
import aprendiendo.spring.jpa1.dto.AlumnoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepositorio extends JpaRepository<AlumnoEntidad,Integer> {

    @Query("SELECT new aprendiendo.spring.jpa1.dto.AlumnoDTO(a.id,a.nombre, a.curso) FROM alumno a WHERE a.edad > 18")
    List<AlumnoDTO> buscaMayoresDeEdad();

    @Query("SELECT a  FROM alumno a WHERE a.nombre = :nombre")
    List<AlumnoEntidad> buscaPorNombre(@Param("nombre") String v1);


    @Query(value = "SELECT CAST(edad AS DOUBLE PRECISION)  FROM alumno WHERE name = :nombre",nativeQuery = true)
    List<Double> buscaPorNombreNative(@Param("nombre") String v1);
}
