package main;

import model.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(100, "Gasolina", 15);

        System.out.println(motor.calcularCustoBeneficio());
        System.out.println(motor.desligarMotor());
        System.out.println(motor.ligarMotor());
        System.out.println(motor.desligarMotor());
    }
}
