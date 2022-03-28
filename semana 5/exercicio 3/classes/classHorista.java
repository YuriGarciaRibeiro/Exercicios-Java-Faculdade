package classes;

public class classHorista extends classFuncionario{
    //Atributos
    double Horas;
    double salario;

    //construtor
    public classHorista(String nome, String cpf, String dataNascimento, String matricula, double Horas) {
        super(nome, cpf, dataNascimento, matricula);
        this.Horas = Horas;
        this.salario = Horas * 50;
    }

    //getters

    public double getHoras() {
        return Horas;
    }

    public double getSalario() {
        return salario;
    }

    //setters

    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    //metodos
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Horas: " + this.Horas);
        System.out.println("Salario: " + this.salario);
    }
}
