package br.com.hc.bean;

public class MedicoConsulta {
    private Medico medico;
    private Consulta consulta;
    private int areaConsulta;

    public MedicoConsulta(){

    }

    public MedicoConsulta(Medico medico, Consulta consulta, int areaConsulta) {
        this.medico = medico;
        this.consulta = consulta;
        this.areaConsulta = areaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getAreaConsulta() {
        return areaConsulta;
    }

    public void setAreaConsulta(int areaConsulta) {
        this.areaConsulta = areaConsulta;
    }
}
