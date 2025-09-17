package S4;

import java.util.Scanner;

public class EntradaDadosMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Voçe digitou : " + x);
        int y;
        y = sc.nextInt();
        System.out.println("Voçe digitou : " + y);
        double z;
        z = sc.nextDouble();
        System.out.println("Voçe digitou : " + z);
        char a;
        a = sc.next().charAt(0);
        System.out.println("Voçe digito : " + a);
        sc.close();
    }

}
