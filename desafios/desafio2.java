package desafios;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String resposta;
    do{
        resposta = "S";
        System.out.println("Por favor digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("digite sua idade: ");
        int idade = input.nextInt();
        if (idade >= 18){
            input.nextLine();
            System.out.println("[1] ESTUDO ");
            System.out.println("[2] REUNIAO ");
            System.out.println("[3] ENTREVISTA ");
            System.out.println("MOTIVO PARA VISITA: ");
            int escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    System.out.printf("Seja bem vindo a area de ESTUDOS %s, ", nome);
                    break;
                case 2:
                    System.out.printf("Seja bem vindo a area de REUNIAO %s, ", nome);
                    break;
                case 3:
                    System.out.printf("Seja bem vindo a area de ENTREVISTA %s, ", nome);
                    break;
            }
            System.out.println("Mais alguem para cadastrar?[S/N] ");
            resposta = input.nextLine();
            } else{
                System.out.println("IDADE INVALIDA. TENTE NOVAMENTE.");
            }
    } while (resposta.equalsIgnoreCase("S"));
    System.out.println("PROGRAMA FINALIZADO");
    input.close();
}
}
    
