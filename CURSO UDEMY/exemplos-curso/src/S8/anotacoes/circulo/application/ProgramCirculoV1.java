package S8.anotacoes.circulo.application;

import java.util.Scanner;

public class ProgramCirculoV1 {
    private static Scanner entrada = new Scanner(System.in);
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println("Digite o valor do raio:");
        double r = Double.parseDouble(entrada.nextLine());
        double c = circuferencia(r);
        double v = volume(r);
        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);
    }

    public static double circuferencia(double r){
        return 2*PI*r;
    }

    public static double volume(double r){
        return 4 * PI * r *r *r/3;
    }

}
