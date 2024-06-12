package aprendiendo.spring.relaciones_jpa.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "libro_id")
    private Libro libro;

    @ManyToMany(mappedBy = "autores")
    private Set<Lector> lectores = new HashSet<>();
}

