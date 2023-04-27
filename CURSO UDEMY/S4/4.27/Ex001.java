import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z,absoluto;
        double raiz, exponencial;
        System.out.println("Digite o primerio valor:");
        x = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o segundo valor:");
        y = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o terceiro valor:");
        z = Integer.parseInt(entrada.nextLine());
        raiz = Math.sqrt(x);
        exponencial = Math.pow(x, y);
        absoluto = Math.abs(z);
        System.out.println("A raiz quadrada do primerio numero e: " + raiz);
        System.out.println("O valor do exponencial do primeiro com o segundo numero e: " + exponencial);
        System.out.println("o valor absoluto do segundo numero e: " + absoluto);
    }
    
}