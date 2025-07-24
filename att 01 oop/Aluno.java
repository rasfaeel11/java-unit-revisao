public class Aluno {
    private String nome;
    private int acertos;
    private double pontuacaoTotal;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAcertos() {
        return acertos;
    }
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    public void calcularPontuacaoTotal(int questoes){
        double pontuacaoTotal =  this.acertos * questoes;
        this.pontuacaoTotal = pontuacaoTotal;
    }
    public void exibirDados(){
        System.out.printf("O aluno %s acertou %d questoes e tirou %.2f de pontuacao", nome, acertos, pontuacaoTotal);
    }
    }

