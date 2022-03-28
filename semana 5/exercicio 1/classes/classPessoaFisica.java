package classes;
public class classPessoaFisica extends classPessoa {
    // Atributos
    String cpf;
    String RG;
    String dataNascimento;

    // Construtor
    public classPessoaFisica(String nome, String endereco, String telefone, String cpf, String RG, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
    }

    // Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
