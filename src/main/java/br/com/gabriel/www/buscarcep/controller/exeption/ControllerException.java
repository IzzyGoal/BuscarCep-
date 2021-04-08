package br.com.gabriel.www.buscarcep.controller.exeption;

import br.com.gabriel.www.buscarcep.model.repsonse.MenssagemModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RequisicaoInvalidaException.class)
    public ResponseEntity<MenssagemModelResponse> requisicaoInvalida(Exception exception){
        MenssagemModelResponse menssagemModelResponse = new MenssagemModelResponse();
        menssagemModelResponse.setCodigoStatus(String.valueOf(HttpStatus.BAD_REQUEST.value()));
        menssagemModelResponse.setMensagem(exception.getMessage());
        return new ResponseEntity<>(menssagemModelResponse,HttpStatus.BAD_REQUEST);
    }

}
