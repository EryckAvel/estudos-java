package S7.exemplo;

import java.util.Scanner;

public class ExFuncoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c;

        System.out.println("Insira os 3 numeros:");
        System.out.println("Número 1:");
        a = Integer.parseInt(entrada.nextLine());
        System.out.println("Número 2:");
        b = Integer.parseInt(entrada.nextLine());
        System.out.println("Número 3:");
        c = Integer.parseInt(entrada.nextLine());

        int value = max(a, b, c);
        showResult(value);

    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x> z){
            aux = x;
        } else if (y > z) {
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}
