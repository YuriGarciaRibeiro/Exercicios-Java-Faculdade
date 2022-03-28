import java.util.ArrayList;


public class empresa {
    private String nome;
    private String cnpj;
    private String salario;
    private String endereco;

    ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();

    public empresa(String nome, String cnpj, String salario, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.salario = salario;
        this.endereco = endereco;
        }

    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void receberFuncionario(funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        for (funcionario funcionario : funcionarios) {
            System.out.println("----------------------------------------------------");
            System.out.println("NOME: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("SALARIO: " + funcionario.getSalario());
            System.out.println("----------------------------------------------------");
        }
    }

    public void removerFuncionario(funcionario funcionario) {
        funcionarios.remove(funcionario);
    }


}