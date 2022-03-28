package classes;

public class classFuncionario {
    //Atributos
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String matricula;

    //construtor
    public classFuncionario(String nome, String cpf, String dataNascimento, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //metodos

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Matricula: " + this.matricula);
    }
}
