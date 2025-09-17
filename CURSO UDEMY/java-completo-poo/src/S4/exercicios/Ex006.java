package S4.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double pi =  3.14159;
        double triangulo = (A * C) / 2;
        double circulo = pi * Math.pow(C, 2.0);
        double trapezio = ((A+B)*C) / 2.0;
        double quadrado = Math.pow(B, 2.0);
        double rentangulo = A * B;
        System.out.printf("TRIANGULO : %.3f%n", triangulo);
        System.out.printf("CIRCULO : %.3f%n", circulo);
        System.out.printf("TRAPEZIO : %.3f%n", trapezio);
        System.out.printf("QUADRADO : %.3f%n", quadrado);
        System.out.printf("RETANGULO : %.3f%n", rentangulo);
    }

}
