package S8.arearetangulo.application;

import S8.arearetangulo.entity.Rentangulo;

import java.util.Scanner;

public class ProgramAreaRentangulo {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Rentangulo rentangulo = new Rentangulo();
        System.out.println("Insira a largura e a altura:");
        System.out.print("Largura:");
        rentangulo.largura = Double.parseDouble(entrada.nextLine());
        System.out.print("Altura:");
        rentangulo.altura = Double.parseDouble(entrada.nextLine());
        System.out.println("Area: " + rentangulo.area());
        System.out.println("Perimetro: " + rentangulo.perimetro());
        System.out.println("Diagonal: " + rentangulo.diagonal());

    }

}
