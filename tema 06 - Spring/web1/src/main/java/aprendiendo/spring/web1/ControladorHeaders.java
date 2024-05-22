package aprendiendo.spring.web1;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/headers")
public class ControladorHeaders {

    @GetMapping("{name}")
    public String saluda(@PathVariable String name, @RequestHeader String profesion)
    {
        return "Hola "+name+ " asi que tu trabajas como: " +profesion;
    }

    @GetMapping("/2/{name}")
    public String saluda(@PathVariable String name, @RequestHeader String ciudad, @RequestHeader String edad)
    {
        return "Hola "+name+ " que vives en "+ciudad+ " y tienes "+edad+" años";
    }
}

