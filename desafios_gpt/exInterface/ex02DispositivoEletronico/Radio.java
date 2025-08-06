package desafios_gpt.exInterface.ex02DispositivoEletronico;

public class Radio implements Dispositivo{

    private boolean estaLigado; // inicio false
    private String nome;

     public Radio(String nome) {
        this.nome = nome;
    }
    
    public void ligar(){
        estaLigado = true;
        System.out.printf("o radio %s esta ligado \n", this.nome);
        System.out.println(estaLigado);
        System.out.println("==================");
    }
    public void desligar(){
        estaLigado = false;
        System.out.printf("o radio %s esta desligado \n", this.nome);
        System.out.println(estaLigado);
        System.out.println("==================");
    }
    public String getNome(){
        return nome;
    }
}
