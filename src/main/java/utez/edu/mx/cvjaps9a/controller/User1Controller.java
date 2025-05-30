package utez.edu.mx.cvjaps9a.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user1")
public class User1Controller {

    @GetMapping
    public String saludo() {
        return "Hola desde User1";
    }
}
