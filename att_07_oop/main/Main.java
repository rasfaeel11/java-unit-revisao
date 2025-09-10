package main;

import model.ControleTelevisao;

public class Main {
    public static void main(String[] args) {
        ControleTelevisao controle1 = new ControleTelevisao(1, "philco");

        System.out.println(controle1.ligarDesligar());
        System.out.println(controle1.avancarCanal());
        System.out.println(controle1.irParaCanal(7));
        System.out.println(controle1.irParaCanal(1));
        System.out.println(controle1.getCanalAtual());
        System.out.println(controle1.retornarCanal());
        System.out.println(controle1.ligarDesligar());
        System.out.println(controle1.avancarCanal());
    }
}
