package br.com.gabriel.www.buscarcep.controller;

import br.com.gabriel.www.buscarcep.model.repsonse.EnderecoModelResponse;
import br.com.gabriel.www.buscarcep.service.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/buscarcep")
public class App {
    @Autowired
    Connection conection;

    @GetMapping("/{cep}")
    public EnderecoModelResponse getEndereco(@PathVariable String cep) throws IOException, InterruptedException {
        Validation.validate(cep);
        return conection.connectionswithcepsite(cep);

    }
}
