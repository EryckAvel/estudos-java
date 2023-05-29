package S8.ex001.application;

import S8.ex001.entidade.Triangulo;

import java.util.Scanner;

public class ProgramEx001 {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //todo Medoto com orientação a Objeto

        Triangulo x, y;
        double areaX, areaY;

        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Insira os dados do Triangulo X: ");
        System.out.print("Lado A: ");
        x.a = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado B: ");
        x.b = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado C: ");
        x.c = Double.parseDouble(entrada.nextLine());
        System.out.println("Insira os dados do Triangulo Y: ");
        System.out.print("Lado A: ");
        y.a = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado B: ");
        y.b = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado C: ");
        y.c = Double.parseDouble(entrada.nextLine());

        areaX = x.area();
        areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo X: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area: X");
        }else{
            System.out.println("Maior area: Y");
        }

    }

}
