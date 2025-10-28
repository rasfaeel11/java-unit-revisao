package model;

public class Motor {
    private int potencia;           
    private String tipoCombustivel; 
    private double consumoMedio;    
    private boolean ligado;         

    public Motor(int potencia, String tipoCombustivel, double consumoMedio) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.consumoMedio = consumoMedio;
        this.ligado = false;
    }

    public boolean ligarMotor() {
        if (!ligado) {
            ligado = true;
            return ligado;
        } else {
            return ligado;
        }
    }

    public boolean desligarMotor() {
        if (ligado) {
            ligado = false;
            return ligado;
        } else {
            return ligado;
        }
    }

    public double calcularCustoBeneficio() {
        double potenciaAjustada = potencia;
        double consumoAjustado = consumoMedio;

        if (tipoCombustivel.equalsIgnoreCase("Etanol")) {
            potenciaAjustada *= 1.2;
            consumoAjustado *= 0.8;
        } else if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            potenciaAjustada *= 1.0;
            consumoAjustado *= 1.2;
        }

        return potenciaAjustada / consumoAjustado;
    }
}
