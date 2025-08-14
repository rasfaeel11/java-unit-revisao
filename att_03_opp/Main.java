package att_03_opp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criacao de Objetos
        Scanner input = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo();
        // Front
        System.out.println("Digite o primerio lado do Triangulo: ");
        triangulo1.setPrimeroLado(input.nextDouble());
        System.out.println("Digite o segundo lado do Triangulo: ");
        triangulo1.setSegundoLado(input.nextDouble());
        System.out.println("Digite o terceiro lado do Triangulo: ");
        triangulo1.setTerceiroLado(input.nextDouble());
        double sp = triangulo1.calculoSemiPerimetro();
        System.out.println(sp);
        double areaTriangulo = triangulo1.calculoAreaTriangulo(sp);
        System.out.println(areaTriangulo);
        String tipoTriangulo = triangulo1.definirTipoTriangulo();
        Boolean ehTriangulo = triangulo1.ehTriangulo();
        System.out.println(ehTriangulo);
        System.out.println(tipoTriangulo);




        input.close();
    }
}
