package aprendiendo.spring.primerprograma;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    public Bean1()
    {
        System.out.println("Construyendo Bean1");
    }


    @PostConstruct
    void ejecuta_despues_de_construir()
    {
        System.out.println("Ya se ha contruido el bean1");
    }
    @PreDestroy
    void ejecuta_antes_de_destruir()
    {
        System.out.println("Se esta destruyendo en bean 1");
    }
}
