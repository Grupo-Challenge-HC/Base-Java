package br.com.hc.bean;

public class ChatBot {
    private String perguntasFrequentes;
    private int tipoPergunta;
    private String perguntasDoUsuario;
    private String historicoMensagens;

    public ChatBot(){

    }

    public String getPerguntasFrequentes() {
        return perguntasFrequentes;
    }

    public void setPerguntasFrequentes(String perguntasFrequentes) {
        this.perguntasFrequentes = perguntasFrequentes;
    }

    public int getTipoPergunta() {
        return tipoPergunta;
    }

    public void setTipoPergunta(int tipoPergunta) {
        this.tipoPergunta = tipoPergunta;
    }

    public String getPerguntasDoUsuario() {
        return perguntasDoUsuario;
    }

    public void setPerguntasDoUsuario(String perguntasDoUsuario) {
        this.perguntasDoUsuario = perguntasDoUsuario;
    }

    public String getHistoricoMensagens() {
        return historicoMensagens;
    }

    public void setHistoricoMensagens(String historicoMensagens) {
        this.historicoMensagens = historicoMensagens;
    }
}
