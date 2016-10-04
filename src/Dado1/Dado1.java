package Dado1;

import java.util.Random;

public class Dado1 {

    public static void main(String[] args) {
        // tentendo rodar o dado e aparecer os números....
        // agora é só saber como colocar as imgs correspondentes :)
        Random random = new Random(6);
        for (int i=0; i<6; i++){
            double numero = Math.random()*6;
            double valorAleatorio = Math.round(numero);
            System.out.println(valorAleatorio);
        }
    }
    
}
