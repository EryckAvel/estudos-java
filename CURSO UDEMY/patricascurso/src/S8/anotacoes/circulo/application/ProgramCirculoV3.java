package S8.anotacoes.circulo.application;

import S8.anotacoes.circulo.util.CalculadorStatic;

import java.util.Scanner;

public class ProgramCirculoV3 {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o valor do raio:");
        double r = Double.parseDouble(entrada.nextLine());
        double c = CalculadorStatic.circuferencia(r);
        double v = CalculadorStatic.volume(r);
        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", CalculadorStatic.PI);
    }


}
