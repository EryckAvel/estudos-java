package S8.exercicio.areatriangulo.application;

import java.util.Scanner;

public class ApplicationTrianguloArea {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        //todo metodo sem orientação a objeto

        double xA, xB, xC, yA, yB, yC, pX, pY, areaX, areaY;
        System.out.println("Insira os dados do Triangulo X: ");
        System.out.print("Lado A: ");
        xA = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado B: ");
        xB = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado C: ");
        xC = Double.parseDouble(entrada.nextLine());
        System.out.println("Insira os dados do Triangulo Y: ");
        System.out.print("Lado A: ");
        yA = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado B: ");
        yB = Double.parseDouble(entrada.nextLine());
        System.out.print("Lado C: ");
        yC = Double.parseDouble(entrada.nextLine());

        pX = (xA + xB + xC)/2;
        pY = (yA + yB + yC)/2;

        areaX = Math.sqrt(pX*(pX - xA)*(pX - xB)*(pX - xC));
        areaY = Math.sqrt(pY*(pY - yA)*(pY - yB)*(pY - yC));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo X: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area: X");
        }else{
            System.out.println("Maior area: Y");
        }

    }

}
