package br.com.hc.bean;

public class PerguntasFrequentes {
    private int tipoPergunta;
    private int respostaDaPergunta;

    public PerguntasFrequentes(){

    }

    public PerguntasFrequentes(int tipoPergunta, int respostaDaPergunta) {
        this.tipoPergunta = tipoPergunta;
        this.respostaDaPergunta = respostaDaPergunta;
    }

    public int getTipoPergunta() {
        return tipoPergunta;
    }

    public void setTipoPergunta(int tipoPergunta) {
        this.tipoPergunta = tipoPergunta;
    }

    public int getRespostaDaPergunta() {
        return respostaDaPergunta;
    }

    public void setRespostaDaPergunta(int respostaDaPergunta) {
        this.respostaDaPergunta = respostaDaPergunta;
    }
}
