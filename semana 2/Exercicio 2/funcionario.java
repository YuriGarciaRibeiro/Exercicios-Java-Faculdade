public class funcionario{
    private String nome;
    private String cpf;
    private String salario;
    


    public funcionario(String nome, String cpf, String salario) {
        this.nome = nome;
        this.cpf = cpf; 
        this.salario = salario;

    }


    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}
