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

        //todo Estrutura for

        int limit, n, soma = 0, i = 0;
        System.out.println("Digite um limite para a soma:");
        limit = Integer.parseInt(entrada.nextLine());

        for (i = 0; i < limit; i++) {
            System.out.println("Digite um número " + (i + 1) + " : ");
            n = Integer.parseInt(entrada.nextLine());
            soma += n;
        }
        System.out.println("O total de " + limit + " número(s), a soma deu: " + soma);

        System.out.println("Incrementando");

        for ( i = 0 ; i < 5; i++){
            System.out.println("O valor de i: " + i);
        }

        System.out.println("Decrementando");

        for ( i = 4 ; i >= 0; i--){
            System.out.println("O valor de i: " + i);
        }

    }

}
