package br.com.hc.bean;

public class Cadastro {
    private String cpfCadastro;
    private String senhaCadastro;

    public Cadastro(){

    }

    public Cadastro(String cpfCadastro, String senhaCadastro) {
        this.cpfCadastro = cpfCadastro;
        this.senhaCadastro = senhaCadastro;
    }

    public String getCpfCadastro() {
        return cpfCadastro;
    }

    public void setCpfCadastro(String cpfCadastro) {
        this.cpfCadastro = cpfCadastro;
    }

    public String getSenhaCadastro() {
        return senhaCadastro;
    }

    public void setSenhaCadastro(String senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
    }
}
