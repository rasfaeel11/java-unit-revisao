package att_04_opp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criacao de objetos
        Scanner input = new Scanner(System.in);
        Colaborador colaborador1 = new Colaborador();

        // obtencao do salario do colaborador
        System.out.println("Digite o salario do Colaborador: ");
        colaborador1.setSalarioColaboradorBruto(input.nextDouble());

        // Utilizacao das sub rotinas
        colaborador1.definirTipoSalario(colaborador1.getSalarioColaboradorBruto());
        colaborador1.calcularDesconto(colaborador1.getSalarioColaboradorBruto(), colaborador1.getDescontoSalarioPorcentagem());
        colaborador1.calcularSalarioLiquido(colaborador1.getSalarioColaboradorBruto(), colaborador1.getDescontoSalarioValor());
        colaborador1.salarioMaximoDesconto(colaborador1.getDescontoSalarioValor());
        
        //Front
        System.out.println("Tipo de Desconto = " + colaborador1.getTipoDesconto());
        System.out.println("Porcentagem do Tipo de Desconto: " + colaborador1.getDescontoSalarioPorcentagem());
        System.out.println("Subtracao do Salario bruto = " + colaborador1.getDescontoSalarioValor());
        System.out.println("Salario liquido = " + colaborador1.getSalarioLiquido());


        input.close();

    }
}