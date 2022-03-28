package classes;

public class classSupervisor extends classAssalariado{
    
    //construtor
    public classSupervisor(String nome, String cpf, String dataNascimento, String matricula) {
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