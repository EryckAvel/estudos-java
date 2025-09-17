package S4.exercicios;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int result = x +  y;
        System.out.println("SOMA : " + result);
    }

}