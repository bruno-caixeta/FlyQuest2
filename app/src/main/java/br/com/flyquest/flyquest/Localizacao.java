package br.com.flyquest.flyquest;

public class Localizacao {

    private short idLocalizacao;

    private String cidade;

    private String bairro;

    private String logradouro;

    private String cep;

    private short numero;

    public short getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(short idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }
}
