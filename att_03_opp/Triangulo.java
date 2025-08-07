package att_03_opp;

public class Triangulo {
    private double primeiroLado;
    private double segundoLado;
    private double terceiroLado;
    private double areaTriangulo;
    private String tipoTriangulo;
    private boolean ehTriangulo;

    // metodos setters
    public void setPrimeroLado(double primeroLado) {
        this.primeiroLado = primeroLado;
    }
    public void setSegundoLado(double segundoLado) {
        this.segundoLado = segundoLado;
    }
    public void setTerceiroLado(double terceiroLado) {
        this.terceiroLado = terceiroLado;
    }
    // calculos
    public double calculoSemiPerimetro(){
        double semiPerimetro = (primeiroLado + segundoLado + terceiroLado) / 2;
        return semiPerimetro;
    }
    public double calculoAreaTriangulo(double sp){
        double areaTriangulo = Math.sqrt(sp * (sp - primeiroLado) * (sp - segundoLado) * (sp - terceiroLado));
        this.areaTriangulo = areaTriangulo;
        return areaTriangulo;
    }
    public String definirTipoTriangulo(){
        String tipoTriangulo;
        if(this.primeiroLado == this.segundoLado && this.primeiroLado == this.terceiroLado){
            tipoTriangulo = "Equilatero";
            this.tipoTriangulo = tipoTriangulo;
        } else if(this.primeiroLado == this.segundoLado || this.segundoLado == this.terceiroLado || this.primeiroLado == this.terceiroLado){
            tipoTriangulo = "Isoceles";
            this.tipoTriangulo = tipoTriangulo;
        } else{
            tipoTriangulo = "Escaleno";
            this.tipoTriangulo = tipoTriangulo;
        }
        return tipoTriangulo;
    }
    // funcao pra saber se e um triangulo ou nao
    public boolean ehTriangulo() {
    boolean ehTriangulo = (primeiroLado + segundoLado > terceiroLado) && (primeiroLado + terceiroLado > segundoLado) && (segundoLado + terceiroLado > primeiroLado);
    if(ehTriangulo == false){
        this.tipoTriangulo = "nao e triangulo";
    }
    return ehTriangulo;
    
}

}
