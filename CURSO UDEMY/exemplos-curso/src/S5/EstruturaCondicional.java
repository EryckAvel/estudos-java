package S5;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        //todo Condicional Simples

        int x = 5;

        System.out.println("Bom dia!");
        if (x > 0) {
            System.out.println("Boa Tarde!");
        }
        System.out.println("Boa Noite!");

        // todo Condicional composta e encadeados

        int hora;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que horas são?");
        hora = Integer.parseInt(entrada.nextLine());

        if (hora < 12){
            System.out.println("Bom dia!");
        }if (hora < 18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }

    }


}
