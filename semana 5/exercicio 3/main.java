import classes.*;
import java.util.Scanner;
import java.util.ArrayList;


public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<classAssistente> assistentes = new ArrayList<>(); 
        ArrayList<classSupervisor> supervisores = new ArrayList<>();
        ArrayList<classComissionado> comissionados = new ArrayList<>();  
        ArrayList<classHorista> horistas = new ArrayList<>();

        while(true){
            System.out.println("Escolha o que voce quer cadastar");
            System.out.println("1 - assalariado");
            System.out.println("2 - comissionado");
            System.out.println("3 - horista");
            System.out.println("4 - mostar todos os dados");    
            System.out.println("5 - sair");
            System.out.print("Opção: ");
            int escolha = input.nextInt();

            if(escolha == 1){
                System.out.print("1 - assistente");
                System.out.print("2 - supervisor");
                System.out.print("Opção: ");
                int escolha2 = input.nextInt();

                if(escolha2 == 1){
                    System.out.print("Digite o nome: ");
                    String nome = input.next();
                    System.out.print("Digite o cpf: ");
                    String cpf = input.next();
                    System.out.print("Digite a data de nascimento: ");
                    String dataNascimento = input.next();
                    System.out.print("Digite a matricula: ");
                    String matricula = input.next();
                    classAssistente assistente = new classAssistente(nome, cpf, dataNascimento, matricula);
                    assistentes.add(assistente);
                }

                else if(escolha2 == 2){
                    System.out.print("Digite o nome: ");
                    String nome = input.next();
                    System.out.print("Digite o cpf: ");
                    String cpf = input.next();
                    System.out.print("Digite a data de nascimento: ");
                    String dataNascimento = input.next();
                    System.out.print("Digite a matricula: ");
                    String matricula = input.next();
                    classSupervisor supervisor = new classSupervisor(nome, cpf, dataNascimento, matricula);
                    supervisores.add(supervisor);
                }

                else{
                    System.out.println("Opção invalida");
                }
            }

            else if(escolha==2){
                System.out.print("Digite o nome: ");
                String nome = input.next();
                System.out.print("Digite o cpf: ");
                String cpf = input.next();
                System.out.print("Digite a data de nascimento: ");
                String dataNascimento = input.next();
                System.out.print("Digite a matricula: ");
                String matricula = input.next();
                System.out.print("Digite o o valor das vendas de roupa:");
                double valorVendasRoupa = input.nextDouble();
                System.out.print("Digite o o valor das vendas de calçados:");
                double valorVendascalçados = input.nextDouble();
                classComissionado comissionado = new classComissionado(nome, cpf, dataNascimento, matricula, valorVendasRoupa, valorVendascalçados);
                comissionados.add(comissionado);
            }

            else if(escolha==3){
                System.out.print("Digite o nome: ");
                String nome = input.next();
                System.out.print("Digite o cpf: ");
                String cpf = input.next();
                System.out.print("Digite a data de nascimento: ");
                String dataNascimento = input.next();
                System.out.print("Digite a matricula: ");
                String matricula = input.next();
                System.out.print("Digite os horas trabalhadas: ");
                double horasTrabalhadas = input.nextDouble();
                classHorista horista = new classHorista(nome, cpf, dataNascimento, matricula, horasTrabalhadas);
                horistas.add(horista);
            }

            else if(escolha==4){
                for(classAssistente assistente : assistentes){
                    assistente.imprimirDados();
                }
                for(classSupervisor supervisor : supervisores){
                    supervisor.imprimirDados();
                }
                for(classComissionado comissionado : comissionados){
                    comissionado.imprimirDados();
                }
                for(classHorista horista : horistas){
                    horista.imprimirDados();
                }
            }

            else if(escolha==5){
                System.out.println("Saindo...");
                break;
            }

            else{
                System.out.println("Opção invalida");
            }
        }
    }
}
