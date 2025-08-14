package desafios_gpt.exInterface.ex02DispositivoEletronico;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDispositivos {
    private List<Dispositivo> dispositivos = new ArrayList<>();

    public void adicionarDispositivos(Dispositivo d){
        dispositivos.add(d);
    }
    public void ligarTodos(){
        for(Dispositivo d : dispositivos){
            d.ligar();
        }
    }

    public void desligarTodos(){
        for(Dispositivo d : dispositivos){
            d.desligar();
        }
    }

}
