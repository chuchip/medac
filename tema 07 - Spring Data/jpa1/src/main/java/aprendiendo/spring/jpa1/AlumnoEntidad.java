package aprendiendo.spring.jpa1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="alumno")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name",length = 100,nullable = false)
    private String nombre;

    private int edad;

    private String curso;
}
