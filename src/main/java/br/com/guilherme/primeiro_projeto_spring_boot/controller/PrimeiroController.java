package br.com.guilherme.primeiro_projeto_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

    @GetMapping("primeiroMetodo")
    public String primeiroMetodo(){
        return "meu primeiro metodo";
    }
}
