package javaCurso;

public class Quadrado {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }
    public double calcularArea(){
        double areaQuadrado = Math.pow(lado, 2);
        return areaQuadrado;
    }
}
