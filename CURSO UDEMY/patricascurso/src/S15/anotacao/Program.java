package S15.anotacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        metodo1();
        System.out.println("Programa Termino!");
    }

    public static void metodo1(){
        //todo Trabalhando com pilha de chamada
        System.out.println("-------- METODO - 1 START --------");
        metodo3();
        System.out.println("-------- METODO - 1 END --------");
    }

    public static void metodo2(){
        //TODO capturando exceções
        System.out.println("-------- METODO - 2 START --------");
        try {
            String[] vect = entrada.nextLine().split(" ");
            int position = entrada.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Invalida!");
        }catch (InputMismatchException i){
            System.out.println("Dado inserido incorreto!");
        }
        System.out.println("-------- METODO - 2 END --------");
    }

    public static void metodo3(){
        //todo mostrando a utilização do bloco finally que e executdo independente de ter lançado exceção ou não
        System.out.println("-------- METODO - 3 START --------");
        File file = new File("C:\\temp\\int.txt");
        try{
            entrada = new Scanner(file);
        }catch (FileNotFoundException f){
            System.out.println("Erro em abrir o arquivo: " + f.getMessage());
        }finally {
            if (entrada != null){
                entrada.close();
            }
            System.out.println("Finally Block");
        }
        System.out.println("-------- METODO - 3 END --------");
    }

}
