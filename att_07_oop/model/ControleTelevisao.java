package model;

public class ControleTelevisao {
    private int idControle;
    private String modelo;
    private int canalAtual;
    private boolean ligado;

    public ControleTelevisao(int idControle, String modelo) {
        this.idControle = idControle;
        this.modelo = modelo;
        this.canalAtual = 1; 
        this.ligado = false; 
    }
    
    public boolean ligarDesligar() {
        this.ligado = !this.ligado;
        return this.ligado;
    }
    public int avancarCanal() {
        if(!ligado) return 0;
        if (ligado) canalAtual++;
        if(ligado && canalAtual > 5) canalAtual = 1;
           
        return canalAtual;
    }
    public int retornarCanal() {
        if(!ligado) return 0;
        if (ligado && canalAtual > 1) canalAtual--;
        if(ligado && canalAtual < 1) canalAtual = 5;
            
        return canalAtual;
    }
    public int irParaCanal(int canal){
        if(ligado && canal >= 1 && canal <= 5) canalAtual = canal;

        if(canal < 1 || canal > 5) return -1;
  
        return canalAtual;
    }

   public int getCanalAtual(){
    return canalAtual;
   }

}
