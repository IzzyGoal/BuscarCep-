package br.com.gabriel.www.buscarcep.model.repsonse;

public class MenssagemModelResponse {
    private String codigoStatus;
    private String mensagem;

    public String getCodigoStatus() {
        return codigoStatus;
    }

    public void setCodigoStatus(String codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
