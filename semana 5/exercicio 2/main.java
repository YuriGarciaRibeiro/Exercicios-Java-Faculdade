import classes.classCD;
import classes.classDVD;
import java.util.Scanner;
import java.util.ArrayList;


public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<classCD> cds = new ArrayList<>();
        ArrayList<classDVD> dvds = new ArrayList<>();

        while(true){
            System.out.println("Escolha o que voce quer cadastar");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - mostar todos os dados");
            System.out.println("4 - sair");
            System.out.print("Opção: ");
            int escolha = input.nextInt();

            if(escolha == 1){
                System.out.print("Digite o codigo: ");
                int codigo = input.nextInt();
                System.out.print("Digite o titulo: ");
                String titulo = input.next();
                System.out.print("Digite o preco: ");
                double preco = input.nextDouble();
                System.out.print("Digite o numero de musicas: ");
                int nMusicas = input.nextInt();
                classCD cd = new classCD(codigo, titulo, preco, nMusicas);
                System.out.println(cd.getDetalhes());
                cds.add(cd);
            }

            else if(escolha==2){
                System.out.print("Digite o codigo: ");
                int codigo = input.nextInt();
                System.out.print("Digite o titulo: ");
                String titulo = input.next();
                System.out.print("Digite o preco: ");
                double preco = input.nextDouble();
                System.out.print("Digite o numero de faixas: ");
                int nFaixas = input.nextInt();
                classDVD  dvd = new classDVD(codigo, titulo, preco, nFaixas);
                System.out.println(dvd.getDetalhes());
                dvds.add(dvd);
            }

            else if(escolha==3){
                System.out.println("======================CD============================");
                for(classCD cd : cds){
                    System.out.println("======================================================");
                    System.out.println(cd.getDetalhes());
                    System.out.println("======================================================");
                }
                System.out.println("======================DVD============================");
                for(classDVD dvd : dvds){
                    System.out.println("======================================================");
                    System.out.println(dvd.getDetalhes());
                    System.out.println("======================================================");
                }
                System.out.println("======================================================");
            }

            
            else if(escolha==4){
                System.out.println("Saindo...");
                break;
            }

            else{
                System.out.println("Opção inválida");
            }



        }




    }







}