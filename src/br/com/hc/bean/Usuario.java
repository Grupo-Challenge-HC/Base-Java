package br.com.hc.bean;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private String cpfUsuario;
    private String telefoneUsuario;
    private Cadastro cadastro;
    private Login login;
    private Agenda agenda;
    private ChatBot chatBot;

    public Usuario(){

    }

    public Usuario(int idUsuario, String nomeUsuario, String cpfUsuario, String telefoneUsuario, Cadastro cadastro, Login login, Agenda agenda, ChatBot chatBot) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.cadastro = cadastro;
        this.login = login;
        this.agenda = agenda;
        this.chatBot = chatBot;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public ChatBot getChatBot() {
        return chatBot;
    }

    public void setChatBot(ChatBot chatBot) {
        this.chatBot = chatBot;
    }

    public void exibirResumoPerfil() {
        System.out.println("----- RESUMO DO USUÁRIO -----");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("CPF: " + cpfUsuario);
        System.out.println("Telefone: " + telefoneUsuario);

        if (cadastro != null) {
            System.out.println("Cadastro realizado.");
        } else {
            System.out.println("Cadastro pendente.");
        }

        if (login != null) {
            System.out.println("Login configurado.");
        } else {
            System.out.println("Login não configurado.");
        }

        if (agenda != null && agenda.getConsultasAgendadas() > 0) {
            System.out.println("Consultas agendadas: " + agenda.getConsultasAgendadas());
        } else {
            System.out.println("Nenhuma consulta agendada.");
        }

        System.out.println("-----------------------------");
    }
}
