package S4.exercicios;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = Integer.parseInt(sc.nextLine());
        B = Integer.parseInt(sc.nextLine());
        C = Integer.parseInt(sc.nextLine());
        D = Integer.parseInt(sc.nextLine());
        int result = (A * B - C * D);
        System.out.println("DIFERENÇA : " + result);
    }

}
