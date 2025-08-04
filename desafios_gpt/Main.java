package desafios_gpt;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael", 19, 3);

        aluno1.setNotas(0, 3.5);
        aluno1.setNotas(1, 10);
        aluno1.setNotas(2, 6.3);
        aluno1.exibirInformacoes();

    }
}
