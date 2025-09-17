package S4.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int p1, n1, p2, n2;
        double vn1, vn2;
        p1 = sc.nextInt();
        n1 = sc.nextInt();
        vn1 = Double.parseDouble(sc.nextLine());
        p2 = sc.nextInt();
        n2 = sc.nextInt();
        vn2 = Double.parseDouble(sc.nextLine());
        double result1 = n1 * vn1;
        double result2 = n2 * vn2;
        double resultTotal = result1 + result2;
        System.out.printf("VALOR A PAGAR : %.2f%n", resultTotal);
    }

}

