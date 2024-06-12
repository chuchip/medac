package aprendiendo.spring.relaciones_jpa.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Lector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "lector",fetch = FetchType.EAGER)
    List<Opinion> opinionList;

    @ManyToMany
    @JoinTable(
            name = "lector_autor",
            joinColumns = @JoinColumn(name = "lector_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<Autor> autores;

    String nombre;
}
