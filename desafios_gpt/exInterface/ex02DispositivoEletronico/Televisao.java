package desafios_gpt.exInterface.ex02DispositivoEletronico;

public class Televisao implements Dispositivo{
    private boolean estaLigado; // inicio false
    private String nome;
    
     public Televisao(String nome) {
        this.nome = nome;
    }
    
    public void ligar(){
        estaLigado = true;
        System.out.printf("a tv %s esta ligada \n", this.nome);
        System.out.println(estaLigado);
        System.out.println("==================");
    }
    public void desligar(){
        estaLigado = false;
        System.out.printf("a tv %s esta desligada \n", this.nome);
        System.out.println(estaLigado);
        System.out.println("==================");
    }
    public String getNome(){
        return nome;
    }
    
}
