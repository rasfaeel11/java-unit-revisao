package desafios;
import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String resposta;
        do{
            resposta = "S";
            System.out.println("AGENDAMENTO LAVA-JATO");
            System.out.println("Digite seu nome");
            String nome = input.nextLine();
            System.out.println("=============MENU============");
            System.out.println("[1] LAVAGEM A SECO ");
            System.out.println("[2] LAVAGEM INTEIROR ");
            System.out.println("[3] LAVAGEM EXTERIOR ");
            System.out.println("[4] LAVAGEM COMPLESTA ");
            System.out.println("SELECIONE A OPCAO DO MENU ACIMA: ");
            int escolha = input.nextInt();
            input.nextLine();
            switch (escolha) {
                case 1:
                    System.out.printf("LAVAGEM A SECO AGENDADA COM SUCESSOR SR. %s \n", nome);
                    break;
                case 2:
                    System.out.printf("LAVAGEM DE INTEIROR AGENDADA COM SUCESSOR SR. %s \n", nome);
                    break;
                case 3:
                    System.out.printf("LAVAGEM DE EXTERIOR AGENDADA COM SUCESSOR SR. %s \n", nome);
                    break;
                case 4:
                    System.out.printf("LAVAGEM COMPLETA AGENDADA COM SUCESSOR SR. %s \n", nome);
                    break;
                default:
                    System.out.println("OPCAO INVALIDA \n");
                    break;
            }
            System.out.printf("Deseja agendar mais algum tipo de lavagem, sr %s?", nome);
            resposta = input.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
    System.out.println("PROGRAMA FINALIZADO");
    input.close();
    }
}
