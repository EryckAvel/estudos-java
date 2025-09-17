package S4.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = Double.parseDouble(sc.nextLine());
        double pi =  3.14159;
        double result = pi * Math.pow(raio, 2.0);
        System.out.printf("A=%.4f%n", result);
    }

}
