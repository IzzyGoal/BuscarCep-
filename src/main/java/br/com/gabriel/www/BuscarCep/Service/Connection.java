package br.com.gabriel.www.BuscarCep.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

@Component
@Service
public class Connection {
    public static void connectionswithcepsite() throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o CEP: ");
        String cep = entrada.next();
        if (8 != cep.length()) {
            System.out.println("Nao foi possivel encontrar o CEP informado");
        }
        else {

            HttpRequest request = HttpRequest.newBuilder()
                    .GET().uri(URI.create("https://viacep.com.br/ws/" + cep + "/json"))
                    .build();
            HttpClient client = HttpClient.newHttpClient();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.body().contains("erro")){
                System.out.println("Nao foi possivel encontrar o CEP informado");
            }
            else System.out.println(response.body().replace("\"", " "));


        }
    }
}