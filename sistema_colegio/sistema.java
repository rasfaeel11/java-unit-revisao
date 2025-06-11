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
        System.out.println("COLEGIO Nome Qualquer");
        System.out.println("----------------------------------");
        System.out.println("SISTEMA DE CADASTRAMENTO DE ALUNOS");
        System.out.println("====================================");
        do{
            System.out.println("MENU");
            System.out.println("COLEGIO Nome Qualquer");
            System.out.println("[1] - CADASTRO ALUNO");
            System.out.println("[2] - LISTAR ALUNOS e QUANTIDADE");
            System.out.println("[3] - BUSCAR ALUNO POR NOME");
            System.out.println("[4] - MEDIA GERAL TURMA");
            System.out.println("[5] - ATUALIZAR NOTA");
            System.out.println("[6] - SAIR DO SISTEMA");
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
                        System.out.printf("ALUNO [%d]: " + alunos.get(i), i, "\n");
                        System.out.println(" ");
                        System.out.printf("NOTA: " + notas.get(i), i, "\n");
                        System.out.println(" ");
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
                    System.out.println("DIGITE O NOME DO ALUNO PARA ATUALIZAR: ");
                    String atualizar = input.nextLine();
                    if (alunos.contains(atualizar)){
                        System.out.println("Verifique o indice do aluno primeiro antes de botar a NOVA NOTA");
                        int indice = alunos.indexOf(atualizar);
                        System.out.println("INDICE: " + indice);
                        System.out.println("Digite a nova nota do aluno" + atualizar);
                        double novanota = input.nextDouble();
                        notas.set(indice, novanota);
                    } else {
                        System.out.println("ALUNO INVALIDO.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema.....");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 6);
        System.out.println("SISTEMA ENCERRADO");
        input.close();
        
    }
}
