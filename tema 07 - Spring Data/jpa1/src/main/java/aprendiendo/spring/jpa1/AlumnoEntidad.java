package aprendiendo.spring.jpa1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class AlumnoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String nombre;

    int edad;

    String curso;
}
