package S6;

import java.util.Scanner;

public class EstruturasRepetitivas {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //todo Estrutura while
        //todo exemplo

        int num, sum = 0;
        System.out.println("Testando repetição, digite um número:");
        num = Integer.parseInt(entrada.nextLine());
        while (num != 0) {
            sum += num;
            num = Integer.parseInt(entrada.nextLine());
        }

        System.out.println(sum);

    }

}
