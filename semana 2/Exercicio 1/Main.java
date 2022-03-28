package exercicio0703;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, idade, id, telefone;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        while (true) {
            System.out.println("Digite o id do cliente: ");
            id = scanner.nextLine();
            if (id.equals("0")) {
                System.out.println("Fim do programa");
                break;
            }
            System.out.println("Digite o nome do cliente: ");
            nome = scanner.nextLine();
            System.out.println("Digite a idade do cliente: ");
            idade = scanner.nextLine();
            System.out.println("Digite o telefone do cliente: ");
            telefone = scanner.nextLine();
            Cliente cliente = new Cliente(nome, idade, id, telefone);
            clientes.add(cliente);    
        }
        for (Cliente cliente : clientes) {
            System.out.println("-----------------------------------------------------");
            cliente.showDados();
        }
    }
}