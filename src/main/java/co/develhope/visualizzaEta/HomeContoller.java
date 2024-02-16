package co.develhope.visualizzaEta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/home")
public class HomeContoller {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/eta")
    public Integer visualizzaEta(@RequestParam(name = "anno-nascita") Integer annoNascita) {
        Integer oggi = LocalDate.now().getYear();
        return oggi - annoNascita;
    }

    @GetMapping("/saluto")
    public String saluto(@RequestParam(required = true) String nome, @RequestParam(required = false, defaultValue = "") String cognome) {
        return "Ciao " + nome + " " + cognome;
    }
    //g
}
