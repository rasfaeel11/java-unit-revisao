package att_05_oop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Energia energia = new Energia();

        System.out.println("Qual foi a leitura do mes anterior? ");
        energia.setLeituraMesAnterior(input.nextDouble());
        System.out.println("E do mes atual? ");
        energia.setLeituraMesAtual(input.nextDouble());

        energia.processarConta();
        System.out.println("Consumo energia: " +  energia.getQtdKWh() + "KWh");
        System.out.println("Valor da conta de Energia: R$" + energia.getValorConta());
        System.out.println("Tipo de Energia: " + energia.getTipoConta());

        input.close();
    }
}
