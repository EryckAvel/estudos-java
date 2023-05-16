package S6.exercicios;

import java.util.Scanner;

public class EstruturaForEx {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int ex;
        System.out.println("Escolha um exemplo de 1 a 4 para testar!");
        System.out.println("Qual exemplo deseja ver:");
        ex = Integer.parseInt(entrada.nextLine());
        int i;
        int num;
        int lim;
        switch (ex){
            case 1:

                System.out.println("Insira o numero:");
                num = Integer.parseInt(entrada.nextLine());
                for (i = 1; i <= num; i++){
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                int out = 0, in = 0;
                System.out.println("Digite a quantidade de valores inseridos:");
                lim = Integer.parseInt(entrada.nextLine());
                for (i = 0; i < lim; i++){
                    System.out.println("Digite o numero:");
                    num = Integer.parseInt(entrada.nextLine());
                    if (num > 10 && num < 20){
                        in += 1;
                    }else{
                        out += 1;
                    }
                }
                System.out.println("In : " + in +", Out : " + out);
            case 3:
                double a, b,c, media;
                System.out.println("Insira a quantidade de teste que sera realizados: ");
                lim = Integer.parseInt(entrada.nextLine());
                for (i = 0; i < lim; i++){
                    System.out.println("Vamos calcular a media " + (i +1) +" :");
                    System.out.println("Valor de A: ");
                    a = Double.parseDouble(entrada.nextLine());
                    System.out.println("Valor de B: ");
                    b = Double.parseDouble(entrada.nextLine());
                    System.out.println("Valor de C: ");
                    c = Double.parseDouble(entrada.nextLine());
                    media = (a + b + c)/3;
                    System.out.printf("Media : %.2f%n", media);
                }
            case 4:
                int nume, deno, resultado;
                System.out.println("Insira a quantidade de teste que sera realizados: ");
                lim = Integer.parseInt(entrada.nextLine());
                for (i = 0; i < lim; i++){
                    System.out.println("Insiras os dados para a divisão: ");
                    System.out.println("Numerador: ");
                    nume = Integer.parseInt(entrada.nextLine());
                    System.out.println("Denominador: ");
                    deno = Integer.parseInt(entrada.nextLine());
                    if (deno == 0){
                        System.out.println("Divisão Impossivel!");
                    }else{
                        resultado = nume/deno;
                        System.out.println(resultado);
                    }
                }
            default:
                System.out.println("Teste não encontrado!");
        }
    }

}
