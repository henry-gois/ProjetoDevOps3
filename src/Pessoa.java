public class Pessoa {

    public String nome;
    public String cpf;
    public String telefone;
    public String dataNascimento;
    public String dataAgendamento;
    public String periodo;

    public Pessoa(String nome, String cpf, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
