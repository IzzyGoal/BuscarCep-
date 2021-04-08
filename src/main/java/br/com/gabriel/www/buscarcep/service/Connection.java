package br.com.gabriel.www.buscarcep.service;

import br.com.gabriel.www.buscarcep.model.repsonse.EnderecoModelResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class Connection {
    private ObjectMapper mapper = new ObjectMapper();


    public EnderecoModelResponse connectionswithcepsite(String cep) throws IOException, InterruptedException {
        //  if (8 != cep.length()) {
        //     System.out.println("Nao foi possivel encontrar o CEP informado");
        //} else {

        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://viacep.com.br/ws/" + cep + "/json"))
                .build();
        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        EnderecoModelResponse endereco = mapper.readValue(response.body(), EnderecoModelResponse.class);
        //if (response.body().contains("erro")) {
        //    System.out.println("Nao foi possivel encontrar o CEP informado");
        //} else System.out.println(response.body()
        //      .replace("\"", " ")
        //       .replace(",", " "));
        return endereco;


    }
}
