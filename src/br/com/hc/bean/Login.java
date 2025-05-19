package br.com.hc.bean;

public class Login {
    private String cpfLogin;
    private String senhaLogin;

    public Login(){

    }

    public Login(String cpfLogin, String senhaLogin) {
        this.cpfLogin = cpfLogin;
        this.senhaLogin = senhaLogin;
    }

    public String getCpfLogin() {
        return cpfLogin;
    }

    public void setCpfLogin(String cpfLogin) {
        this.cpfLogin = cpfLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
}
