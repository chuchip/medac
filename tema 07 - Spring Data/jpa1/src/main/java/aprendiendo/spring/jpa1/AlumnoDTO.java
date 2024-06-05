package aprendiendo.spring.jpa1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AlumnoDTO {
    private int id;
    private String nombre;
    private String curso;
}
