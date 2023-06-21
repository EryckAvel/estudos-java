package S14.exercicio.circulo.application;

import S14.exercicio.circulo.entity.Circulo;
import S14.exercicio.circulo.entity.Forma;
import S14.exercicio.circulo.entity.Retangulo;
import S14.exercicio.circulo.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramArea {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        System.out.println("----------- Calculando da Area das Formas -----------\n");
        System.out.print("Quantas Formas desseja calcular: ");
        Integer lim = Integer.parseInt(entrada.nextLine());
        System.out.println("\n----------- Listagem de Formas -----------\n");
        System.out.println("    - 1. Retangulo");
        System.out.println("    - 2. Circulo");
        for (int i = 0; i<lim; i++){
            System.out.println("\n----------- #" + (i+1) + " Forma -----------");
            System.out.print("\nQual forma deseja selecionar:");
            Integer index = Integer.parseInt(entrada.nextLine());
            switch (index) {
                case 1:
                    System.out.print("\nCor (PRETO, AZUL, VERMELHO): ");
                    Cor cor = Cor.valueOf(entrada.nextLine());
                    System.out.print("Digite a Altura do retangulo: ");
                    Double altura = Double.parseDouble(entrada.nextLine());
                    System.out.print("Digite a Largura do retangulo: ");
                    Double largura = Double.parseDouble(entrada.nextLine());
                    formas.add(new Retangulo(cor, largura, altura));
                    break;
                case 2:
                    System.out.print("\nCor (PRETO, AZUL, VERMELHO): ");
                    cor = Cor.valueOf(entrada.nextLine());
                    System.out.println("Digite o Raio do Circulo: ");
                    Double raio = Double.parseDouble(entrada.nextLine());
                    formas.add(new Circulo(cor, raio));
                    break;
                default:
                    System.out.println("Forma não encotrada!");
            }
        }
        System.out.println("\n----------- Exibição de Dados das Formas -----------\n");
        int i = 0;
        for (Forma forma: formas){
            System.out.println("\n----------- #" + (i+1) + " Forma -----------");
            System.out.println(forma);
            i++;
        }

    }

}
