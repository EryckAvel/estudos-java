package S18.anotacao.formas.app;

import S18.anotacao.formas.enums.Cor;
import S18.anotacao.formas.model.Circulo;
import S18.anotacao.formas.model.Retangulo;

import java.util.Scanner;

public class FormasAplication {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------ INTERANDO FORMAS ------------");
        System.out.print("Digite a forma que deseja interagir: ");
        String tipoforma = entrada.nextLine();
        switch (tipoforma){
            case "circulo" -> formaCirculo();
            case "retangulo" -> formaRetangulo();
            default -> System.out.println("Tipo de forma não encontrado!");
        }
    }


    private static void formaCirculo() {
        System.out.print("Digite o raio do circulo : ");
        double raio = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite a cor do circulo : ");
        Cor cor = Cor.valueOf(entrada.nextLine());
        Circulo circulo = new Circulo(cor, raio);
        System.out.println(circulo.toString());
    }

    private static void formaRetangulo() {
        System.out.print("Digite a largura do retangulo : ");
        double largura = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite a altura do retangulo : ");
        double altura = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite a cor do retangulo : ");
        Cor cor = Cor.valueOf(entrada.nextLine());
        Retangulo retangulo = new Retangulo(cor, largura, altura);
        System.out.println(retangulo.toString());
    }


}
