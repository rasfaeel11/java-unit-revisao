package desafios_gpt;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;

    public  Aluno(String nome, int idade, int numeroNotas){
        this.nome = nome;
        this.idade = idade;
        this.notas = new double[numeroNotas];
    }

   public void setNotas(int indice, double notas){
        if (indice >= 0 && indice < this.notas.length){
            this.notas[indice] = notas;
        } else{
            System.out.println("numero invalido");
        }
   }
   public double calcularMedia(){
        double soma = 0.0;
        for(double notas : this.notas){
            soma += notas;
        }
        return soma / this.notas.length;
   }
   public boolean estaAprovado(){
    if (this.calcularMedia() >= 7){
        return true;
    } else{
        return false;
    }
   }

   public void exibirInformacoes(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade" + this.idade);
    System.out.println("Media: " + this.calcularMedia());
    System.out.println("Aprovado: " + this.estaAprovado());
   }

}
