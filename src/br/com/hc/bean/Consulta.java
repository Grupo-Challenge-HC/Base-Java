package br.com.hc.bean;

public class Consulta {
    private int consultaMarcada;
    private int tipoConsulta;
    private int areaConsulta;

    public Consulta(){

    }

    public Consulta(int consultaMarcada, int tipoConsulta, int areaConsulta) {
        this.consultaMarcada = consultaMarcada;
        this.tipoConsulta = tipoConsulta;
        this.areaConsulta = areaConsulta;
    }

    public int getConsultaMarcada() {
        return consultaMarcada;
    }

    public void setConsultaMarcada(int consultaMarcada) {
        this.consultaMarcada = consultaMarcada;
    }

    public int getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(int tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public int getAreaConsulta() {
        return areaConsulta;
    }

    public void setAreaConsulta(int areaConsulta) {
        this.areaConsulta = areaConsulta;
    }
}
