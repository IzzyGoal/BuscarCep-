package br.com.gabriel.www.BuscarCep.Controller;
import br.com.gabriel.www.BuscarCep.Service.Connection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@RequestMapping("/buscarcep")
public class App extends Connection {

    @GetMapping
    public static void main(String[] args) throws IOException, InterruptedException {
        connectionswithcepsite();
    }
}
