public class main {
    public static void main(String[] args) {
        empresa empresa1 = new empresa("empresa", "123456789", "1000", "rua 1");
        funcionario funcionario1 = new funcionario("funcionario", "123456789", "1000");
        funcionario funcionario2 = new funcionario("funcionario2", "123456789", "1000");
        funcionario funcionario3 = new funcionario("funcionario3", "123456789", "1000");
        funcionario funcionario4 = new funcionario("funcionario4", "123456789", "1000");

        empresa1.receberFuncionario(funcionario1);
        empresa1.receberFuncionario(funcionario2);
        empresa1.receberFuncionario(funcionario3);
        empresa1.receberFuncionario(funcionario4);

        empresa1.mostrarFuncionarios();


    }
}
