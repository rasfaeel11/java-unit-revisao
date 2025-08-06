package desafios_gpt.exInterface.ex02DispositivoEletronico;

public class Main {
    public static void main(String[] args) {
        GerenciadorDispositivos gerenciadorDispositivos = new GerenciadorDispositivos();

        Dispositivo tv = new Televisao("Samsung");
        Dispositivo radio = new Radio("Philco");

        gerenciadorDispositivos.adicionarDispositivos(radio);
        gerenciadorDispositivos.adicionarDispositivos(tv);
        
        gerenciadorDispositivos.ligarTodos();
        gerenciadorDispositivos.desligarTodos();

      
    }
}
