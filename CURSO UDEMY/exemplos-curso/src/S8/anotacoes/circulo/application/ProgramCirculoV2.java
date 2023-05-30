package S8.anotacoes.circulo.application;

import S8.anotacoes.circulo.util.Calculador;

import java.util.Scanner;

public class ProgramCirculoV2 {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Calculador calc = new Calculador();
        System.out.println("Digite o valor do raio:");
        double r = Double.parseDouble(entrada.nextLine());
        double c = calc.circuferencia(r);
        double v = calc.volume(r);
        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n",calc.PI);
    }


}
