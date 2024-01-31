package S5;

import java.util.Scanner;

public class EstruturaCondicional {

    private static Scanner entrada = new Scanner(System.in);

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
        System.out.println("Que horas são?");
        hora = Integer.parseInt(entrada.nextLine());

        if (hora < 12){
            System.out.println("Bom dia!");
        }else if (hora < 18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }

        //todo Exemplo 01

        int minutos;
        double valor = 0;
        System.out.println("Digite a quantidade de minutos usados:");
        minutos = Integer.parseInt(entrada.nextLine());
        if (minutos <= 100){
            valor = 50.00;
        }else if (minutos > 100){
            valor = 50 + (2.0 * (minutos - 100));
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        //todo operadores de atribuição acumulativa
        //a += b , a = a+b
        //a -= b , a = a-b
        //a *= b , a = a*b
        //a /= b , a = a/b
        //a %= b , a = a%b


        //todo switch-case
        //todo exemplo

        int dia;
        System.out.println("Vamos descobrir o dia da semana pela númeração");
        System.out.println("Digite um numero de 1 a 7:");
        dia = Integer.parseInt(entrada.nextLine());
        switch (dia){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERCA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("DIA NÃO ENCONTRADO!");
        }

        //TODO expressão ternaria
        //todo ( codincao ) ? valor_verdadeiro : valor_se_falso

        System.out.println((2 > 4) ? 50 : 80);


    }




}
