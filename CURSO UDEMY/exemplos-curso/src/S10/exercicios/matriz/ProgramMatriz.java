package S10.exercicios.matriz;

import java.util.Scanner;

public class ProgramMatriz {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Projeto sobre Matriz!\n");
        System.out.print("Insira a quantidade de Linhas da Matriz: ");
        int lin = Integer.parseInt(entrada.nextLine());
        System.out.print("Insira a quantidade de Colunas da Matriz: ");
        int col = Integer.parseInt(entrada.nextLine());
        int matriz[][] = new int[lin][col];
        for (int i = 0; i < lin; i++){
            System.out.println("Digite os valores da " + (1+i) + "a linha:");
            for (int f = 0; f < col; f++){
                System.out.print("Coluna " + (f+1) + ": ");
                matriz[i][f] = Integer.parseInt(entrada.nextLine());
            }
        }

        if (lin != 0 || col != 0) {
            System.out.println("-------------------------------------");

            System.out.println("Matriz feita\n");

            for (int i = 0; i < lin; i++) {
                for (int f = 0; f < col; f++) {
                    System.out.print(matriz[i][f] + " ");
                }
                System.out.println("");
            }

            System.out.println();

            System.out.println(matriz[1].length);

            System.out.println("-------------------------------------");

            System.out.print("Insira o numero que deseja buscar na Matriz: ");
            int num = Integer.parseInt(entrada.nextLine());
            for (int i = 0; i < lin; i++) {
                for (int f = 0; f < col; f++) {
                    if (matriz[i][f] == num) {
                        System.out.println("Posição do Valor (" + i + ", " + f + ");");
                        if (f > 0) {
                            System.out.println("Esquerda: " + matriz[i][f - 1]);
                        }
                        if (i > 0) {
                            System.out.println("Em cima: " + matriz[i - 1][f]);
                        }
                        if (f < matriz[i].length - 1) {
                            System.out.println("Direita: " + matriz[i][f + 1]);
                        }
                        if (i < matriz.length - 1) {
                            System.out.println("Embaixo: " + matriz[i + 1][f]);
                        }
                    }
                }
            }
        }else{
            System.out.println("Entrada de dados invalida!");
        }
    }

}
