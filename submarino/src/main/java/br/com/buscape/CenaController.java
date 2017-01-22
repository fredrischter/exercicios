package br.com.buscape;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.buscape.Cena;

@RestController
public class CenaController {

    private static final String template = "Cena %s criada!";

    @RequestMapping("/cena")
    public String cena(@RequestParam(value="entrada", defaultValue="") String entrada) {
        return new Cena(entrada).toString();
    }
}
