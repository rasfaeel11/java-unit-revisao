package desafios;
import java.util.Scanner;

public class desafio1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String pedido;
        do {
            System.out.println("========LANCHONETE PAN RAFA==========");
            System.out.println("===========SEJA BEM-VINDO===========");
            System.out.println("Olá, meu nome é Rafael. Por favor, se identifique: ");
            String nome = input.nextLine();
            System.out.println("===============MENU======================");
            System.out.println("[1] Sanduiche de Frango");
            System.out.println("[2] Sanduiche de Carne");
            System.out.println("[3] Sanduiche de Queijo");
            System.out.println("Selecione sua opcao: ");
            int escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    System.out.printf("%s escolheu Sanduiche de Frango, otima escolha! \n", nome);
                    break;
                case 2:
                    System.out.printf("%s escolheu Sanduiche de Carne, otima escolha! \n", nome);
                    break;
                case 3:
                    System.out.printf("%s escolheu Sanduiche de Queijo, otima escolha! \n", nome);
                    break;
            }
            System.out.println("==========================================");
            System.out.println("Por favor, avalie nosso atendimento de [0 a 5]:  ");
            float atendimento = input.nextInt();
            input.nextLine();
            if (atendimento > 3.5 && atendimento < 4.5){
                System.out.printf("%s escolheu o atedimento BOM \n", nome);
            } else if (atendimento == 5){
                System.out.printf("%s escolheu o atedimento EXCELENTE \n", nome);
            } else if(atendimento < 3.5 && atendimento > 2){
                System.out.printf("%s escolheu o atedimento OK \n", nome);
            } else if (atendimento < 2){
                System.out.printf("%s escolheu o atedimento RUIM \n", nome);
            }
            System.out.printf("Obrigado pela escolha %s, deseja fazer mais um pedido?[S/N]: \n", nome);
            pedido = input.nextLine();
        } while (pedido.equalsIgnoreCase("S"));

    System.out.println("===============PROGRAMA FINALIZADO================");
    input.close();
        }
}