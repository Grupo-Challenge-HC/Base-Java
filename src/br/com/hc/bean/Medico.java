package br.com.hc.bean;

public class Medico {
    private int tipoMedico;
    private int idMedico;

    public Medico(){

    }

    public Medico(int tipoMedico, int idMedico) {
        this.tipoMedico = tipoMedico;
        this.idMedico = idMedico;
    }

    public int getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(int tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
}
