package att_05_oop;

public class Energia {
    private double leituraMesAnterior;
    private double leituraMesAtual;
    private double qtdKWh;
    private double valorConta;
    private String tipoConta;

    public void setLeituraMesAnterior(double leituraMesAnterior) {
        this.leituraMesAnterior = leituraMesAnterior;
    }
    public void setLeituraMesAtual(double leituraMesAtual) {
        this.leituraMesAtual = leituraMesAtual;
    }

    public double getQtdKWh() {
        return qtdKWh;
    }
    public double getValorConta() {
        return valorConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }

    public double quantidadeQWh(){
        double quatQwh;
        if(this.leituraMesAnterior > this.leituraMesAtual){
            quatQwh = this.leituraMesAnterior - this.leituraMesAtual;
        } else{
            quatQwh = this.leituraMesAtual - this.leituraMesAnterior;
        }

        this.qtdKWh = quatQwh;
        return quatQwh;
    }

    public double valorContaEnergia(){
        double valorConta;
        double valorPadraoKWh = 0.48;
        double valorPadraoConsumo = 100.0;
        double valorMedioKwh = valorPadraoKWh * 1.10;
        double valorMedioConsumo = 400.0;
        double valorMaximoKwh = valorPadraoKWh * 1.30;

        if(this.qtdKWh < valorPadraoConsumo){
            valorConta = qtdKWh * valorPadraoKWh;
        } else if(this.qtdKWh < valorMedioConsumo){
            valorConta = qtdKWh * valorMedioKwh;
        } else{
            valorConta = qtdKWh * valorMaximoKwh;
        }
        this.valorConta = valorConta;
        return valorConta;
    }

    public String tipoContaEnergia(){
        String contaEnergia;
        
        if(this.valorConta <= 100){
            contaEnergia = "Abaixo Consumo";
        } else if(this.valorConta > 100 && this.valorConta <= 400){
            contaEnergia = "Consumo Padrao";
        } else {
            contaEnergia = "Consumo Maximo";
        }
        this.tipoConta = contaEnergia;
        return contaEnergia;
    }

    public boolean consumoMinimoEnergia(){
        boolean consumoMinimoEnergia;
        if(this.valorConta < 25.0){
            consumoMinimoEnergia = true;
            this.valorConta = 25;
        } else{
            consumoMinimoEnergia = false;
        }
        return consumoMinimoEnergia;
    }

    public void ordemRotinas(){
        quantidadeQWh();
        valorContaEnergia();
        consumoMinimoEnergia();
        tipoContaEnergia();
    }
}
