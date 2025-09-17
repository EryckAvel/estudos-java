package S4.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double salarioHora;
        numero = Integer.parseInt(sc.nextLine());
        horas = Integer.parseInt(sc.nextLine());
        salarioHora = Double.parseDouble(sc.nextLine());
        double result = salarioHora * horas;
        System.out.println("NUMBER : " + numero);
        System.out.printf("SALARY : %.2f%n", result);
    }

}
