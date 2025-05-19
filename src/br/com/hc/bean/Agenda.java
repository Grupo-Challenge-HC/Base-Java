package br.com.hc.bean;

public class Agenda {
    private int consultasAgendadas;
    private int agendarConsulta;
    private int tipoConsulta;
    private int areaConsulta;
    private int metodoConsulta;

    public Agenda(){

    }

    public Agenda(int consultasAgendadas, int agendarConsulta, int tipoConsulta, int areaConsulta, int metodoConsulta) {
        this.consultasAgendadas = consultasAgendadas;
        this.agendarConsulta = agendarConsulta;
        this.tipoConsulta = tipoConsulta;
        this.areaConsulta = areaConsulta;
        this.metodoConsulta = metodoConsulta;
    }

    public int getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(int consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    public int getAgendarConsulta() {
        return agendarConsulta;
    }

    public void setAgendarConsulta(int agendarConsulta) {
        this.agendarConsulta = agendarConsulta;
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

    public int getMetodoConsulta() {
        return metodoConsulta;
    }

    public void setMetodoConsulta(int metodoConsulta) {
        this.metodoConsulta = metodoConsulta;
    }
}
