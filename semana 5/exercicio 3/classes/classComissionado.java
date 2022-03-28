package classes;

public class classComissionado extends classFuncionario{
    //Atributos
    double valorRoupas;
    double valorCalçados;
    double salario;

    //construtor
    public classComissionado(String nome, String cpf, String dataNascimento, String matricula, double valorRoupas, double valorCalçados) {
        super(nome, cpf, dataNascimento, matricula);
        this.valorRoupas = valorRoupas;
        this.valorCalçados = valorCalçados;
        this.salario = valorRoupas * 0.05 + valorCalçados * 0.07;
    }

    //getters
    public double getValorRoupas() {
        return valorRoupas;
    }

    public double getValorCalçados() {
        return valorCalçados;
    }

    public double getSalario() {
        return salario;
    }

    //setters

    public void setValorRoupas(double valorRoupas) {
        this.valorRoupas = valorRoupas;
    }

    public void setValorCalçados(double valorCalçados) {
        this.valorCalçados = valorCalçados;
    }

    //metodos

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Valor Roupas: " + this.valorRoupas);
        System.out.println("Valor Calçados: " + this.valorCalçados);
        System.out.println("Salario: " + this.salario);
    }
}