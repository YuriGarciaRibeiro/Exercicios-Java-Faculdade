package classes;

public class classAssistente extends classAssalariado{
    
    //construtor
    public classAssistente(String nome, String cpf, String dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento, matricula);
        this.salario = 1000;
    }

    //getters
    public double getSalario() {
        return salario;
    }

    //metodos
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salario: " + this.salario);
    }


}