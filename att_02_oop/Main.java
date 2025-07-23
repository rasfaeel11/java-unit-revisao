package att_02_oop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Colaborador colaborador1 = new Colaborador();
        int parcelas;
        double parcelaMensal;

        System.out.println("por favor digite seu nome para a realizacao do emprestimo:");
        colaborador1.setNome(input.nextLine());
        System.out.println("agora digite sua renda mensal: ");
        colaborador1.setRendaMensal(input.nextDouble());
        System.out.println("valor que deseja para emprestimo: ");
        colaborador1.setValorDesejadoEmprestimo(input.nextDouble());
        
        if (colaborador1.getValorDesejadoEmprestimo() < 1000){
            parcelas = 3;
            parcelaMensal = colaborador1.calculoEmprestimo(3, colaborador1.getValorDesejadoEmprestimo());
        } else { 
            parcelas = 4;
            parcelaMensal = colaborador1.calculoEmprestimo(4, colaborador1.getValorDesejadoEmprestimo());
        }
        if (parcelaMensal > colaborador1.getRendaMensal() / 3){
            System.out.println("AVISO! Valor da parcela maior que um terco do salario.");
        }

        System.out.println("Nome: " + colaborador1.getNome());
        System.out.println("Valor da Parcela mensal: " + parcelaMensal);
        System.out.println("Quantide de Parcelas: " + parcelas);

        input.close();
    }
} 
