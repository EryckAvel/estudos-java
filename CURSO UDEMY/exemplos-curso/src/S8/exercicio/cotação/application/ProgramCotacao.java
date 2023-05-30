package S8.exercicio.cotação.application;

import S8.exercicio.cotação.util.Cotacao;

import java.util.Scanner;

public class ProgramCotacao {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Convesor de cotação do dolar!");
        System.out.print("Preço atual do dolar:");
        double c = Double.parseDouble(entrada.nextLine());
        System.out.print("Quantidade de dolares a serem comprados:");
        double v = Double.parseDouble(entrada.nextLine());
        System.out.printf("Valor a ser pago em reais e: %.2f", Cotacao.convercaoDeCotacao(c, v));
    }

}

