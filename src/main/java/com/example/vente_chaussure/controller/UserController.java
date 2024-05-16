package com.example.vente_chaussure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/salutation")
    public String hello() {
        String salutation= "Bonjour les gars";
        return salutation;
    }
}
