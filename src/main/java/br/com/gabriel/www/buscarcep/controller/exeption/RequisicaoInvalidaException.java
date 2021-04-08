package br.com.gabriel.www.buscarcep.controller.exeption;

public class RequisicaoInvalidaException extends RuntimeException {
    public RequisicaoInvalidaException(String menssagem) {
        super(menssagem);
    }
}
