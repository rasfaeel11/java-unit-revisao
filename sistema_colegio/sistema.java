package sistema_colegio;
import java.util.Scanner;
import java.util.ArrayList;

public class sistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Double soma = 0.0;
        ArrayList <String> alunos = new ArrayList<String>();
        ArrayList <Double> notas = new ArrayList<Double>();
        System.out.println("COLEGIO PUNHETA DE VACA");
        System.out.println("----------------------------------");
        System.out.println("SISTEMA DE CADASTRAMENTO DE ALUNOS");
        System.out.println("====================================");
        do{
            System.out.println("MENU");
            System.out.println("[1] - CADASTRO ALUNO");
            System.out.println("[2] - LISTAR ALUNOS e QUANTIDADE");
            System.out.println("[3] - BUSCAR ALUNO POR NOME");
            System.out.println("[4] - MEDIA GERAL TURMA");
            System.out.println("[5] - SAIR DO SISTEMA");
            System.out.println("Escolha sua opcao: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("NOME DO ALUNO: ");
                    String aluno = input.nextLine();
                    System.out.println("NOTA DO ALUNO: ");
                    Double nota = input.nextDouble();
                    alunos.add(aluno);
                    notas.add(nota);
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("QUANTIDADE");
                    System.out.println(alunos.size());
                    System.out.println("TODOS OS ALUNOS \n");
                    for (int i = 0; i <alunos.size(); i++){
                        System.out.printf("ALUNO [%d]: " + alunos.get(i), i);
                    }
                    break;
                case 3:
                    System.out.println("DIGITE UM ALUNO PARA BUSCAR O NOME: ");
                    String busca = input.nextLine();
                    System.out.println(alunos.contains(busca));
                    break;
                case 4:
                    for (Double n : notas){
                        soma += n;
                    }
                    Double media = soma / alunos.size();
                    System.out.println("MEDIA DOS ALUNOS: " + media);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.....");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 5);
        System.out.println("SISTEMA ENCERRADO");
        input.close();
        
    }
}
