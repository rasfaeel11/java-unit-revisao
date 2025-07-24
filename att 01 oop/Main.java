<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        // main code
        System.out.println("Qual o nome do aluno? ");
        aluno1.setNome(input.nextLine());
        System.out.println("Quantos foram os acertos desse aluno? ");
        aluno1.setAcertos(input.nextInt());
        System.out.println("Quantas questoes foram? ");
        int questoes = input.nextInt();
        aluno1.calcularPontuacaoTotal(questoes);
        aluno1.exibirDados();
       
        input.close();
    }
}
=======
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        // main code
        System.out.println("Qual o nome do aluno? ");
        aluno1.setNome(input.nextLine());
        System.out.println("Quantos foram os acertos desse aluno? ");
        aluno1.setAcertos(input.nextInt());
        System.out.println("Quantas questoes foram? ");
        int questoes = input.nextInt();
        aluno1.calcularPontuacaoTotal(questoes);
        aluno1.exibirDados();
       
        input.close();
    }
}
>>>>>>> 71886f91504597ec4162f1099db3ab2bfd5da088
