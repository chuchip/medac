package aprendiendo.spring.relaciones_jpa.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Lector lector;

    @ManyToOne
    Libro libro;

    int nota;

    @Override
    public String toString() {
        return "Opinion{" +
                "id=" + id +
                ", lector=" + lector.getNombre() +
                ", Titulo libro=" + libro.getTitulo() +
                ", Autor libro=" + libro.getAutor().getNombre() +
                ", nota=" + nota +
                '}';
    }
}
