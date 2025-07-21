package sistema_biblioteca;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criacao de objetos e declaracao de variaveis globais
        Scanner input = new Scanner(System.in);
        Livro livro = new Livro();
        ArrayList<String> livrosNome = new ArrayList<String>();
        ArrayList<String> livrosAutores = new ArrayList<String>();
        ArrayList<Integer> livrosPublicacao = new ArrayList<Integer>();
        ArrayList<Double> livrosPreco = new ArrayList<Double>();
        int opcao;


        //codigo principal
        System.out.println("========================");
        System.out.println("SISTEMA BIBLIOTECA DE BAIRRO");
        System.out.println("========================");
        do{
            System.out.println("MENU");
            System.out.println("BIBLIOTECA Nome Qualquer");
            System.out.println("[1] - CADASTRO LIVRO");
            System.out.println("[2] - LISTAR LIVROS e QUANTIDADE");
            System.out.println("[3] - BUSCAR LIVRO POR NOME");
            System.out.println("[4] - APLICAR DESCONTO");
            System.out.println("[5] - ATUALIZAR PRECO");
            System.out.println("[6] - REMOVER LIVRO");
            System.out.println("[7] - SAIR DO SISTEMA");
            System.out.println("Escolha sua opcao: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("NOME LIVRO: ");
                    String nomeLivro = input.nextLine();
                    livrosNome.add(nomeLivro);
                    System.out.println("AUTOR LIVRO: ");
                    String autorLivro = input.nextLine();
                    livrosAutores.add(autorLivro);
                    System.out.println("ANO PUBLICACAO: ");
                    int anoPublicacao = input.nextInt();
                    livrosPublicacao.add(anoPublicacao);
                    System.out.println("PRECO LIVRO: ");
                    double precoLivro = input.nextDouble();
                    livrosPreco.add(precoLivro);
                    livro.cadastroLivro(nomeLivro, autorLivro, anoPublicacao, precoLivro);
                    break;
                case 2:
                    System.out.println("LISTA DE LIVROS CADASTRADOS ATE O MOMENTO");
                    System.out.println("Quantidade de livros ate o momento: " + livrosNome.size());
                    for(int i = 0; i < livrosNome.size(); i++){
                        System.out.printf("Livro: %s \n", livrosNome.get(i));
                        System.out.printf("Autor: %s \n", livrosAutores.get(i));
                        System.out.printf("Publicacao: %d \n", livrosPublicacao.get(i));
                        System.out.printf("Preco: %.2f \n", livrosPreco.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do livro para Buscar: ");
                    String buscarLivro = input.nextLine();
                        if (livrosNome.contains(buscarLivro)){
                            System.out.println("Livro encontrado!");
                        } else{
                            System.out.println("Livro ainda nao adicionado");
                        }
                    break;
                case 4:
                        for(int i = 0; i < livrosNome.size(); i++){
                            System.out.printf("[%d] %s \n", i, livrosNome.get(i));
                        }
                    System.out.println("Em qual livro voce deseja aplicar desconto? ");
                    int indiceLivro = input.nextInt();
                    System.out.println("Quantos % de desconto voce deseja aplicar?");
                    int percentual = input.nextInt();
                    double indexpreco = livrosPreco.get(indiceLivro);
                    double novoPreco = livro.aplicarDesconto(indexpreco, percentual);
                    livrosPreco.set(indiceLivro, novoPreco);

                    break;
            }
        } while (opcao !=7);

        input.close();

    }
}
