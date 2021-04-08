package br.com.gabriel.www.buscarcep.controller;

import br.com.gabriel.www.buscarcep.controller.exeption.RequisicaoInvalidaException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static void validate(String cep) {

        validaCepTamanho(cep);
    }

    private static void validaCepTamanho(String cep) {

        Boolean resultado = true;

        Pattern patternCep = Pattern.compile("^(([0-9]{2}\\.[0-9]{3}-[0-9]{3}|([0-9]{2}[0-9]{3})-[0-9]{3}|([0-9]){8}))$");
        Matcher matcherCep = patternCep.matcher(cep);
        resultado = matcherCep.find();

        if(!resultado) {
            throw new RequisicaoInvalidaException("O Cep deve conter tamanho 8");
        }

    }


}
