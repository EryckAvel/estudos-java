package S10.anotações.application;

import S10.anotações.entity.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        int i = 0;
        double soma = 0.0;
        double media = 0.0;

        //TODO vetores

        System.out.println("Iniciando Projeto de Estudos do S10!");
        System.out.print("Digite o numero do teste que deseja realizar:");
        num = Integer.parseInt(entrada.nextLine());
        switch (num) {
            case 1:
                //TODO tipos primitivos e tipos referencias
                int p = 0;
                System.out.println(p);
                p = 10;
                System.out.println(p);
                break;
            case 2:
                //TODO vetores de primitivos
                System.out.print("Digite a quantidade de valores:");
                num = Integer.parseInt(entrada.nextLine());
                double[] vetor = new double[num];
                for (i = 0; i < num; i++) {
                    System.out.println("Digite a Altura:");
                    vetor[i] = Double.parseDouble(entrada.nextLine());
                }
                for (i = 0; i < num; i++) {
                    soma += vetor[i];
                }
                media = soma / num;
                System.out.printf("A media das altura inseridas e de : %.2f", media);
                break;
            case 3:
                //TODO vetores de objetos
                System.out.print("Digite a quantidade de valores:");
                num = Integer.parseInt(entrada.nextLine());
                Produto[] produtos = new Produto[num];
                for (i = 0; i < num; i++) {
                    System.out.println("Produto " + (i + 1) + ": ");
                    System.out.print("Digite o Nome do Produto:");
                    String nome = entrada.nextLine();
                    System.out.print("Digite o Preço do Produto:");
                    double preco = Double.parseDouble(entrada.nextLine());
                    produtos[i] = new Produto(nome, preco);
                }
                for (i = 0; i < num; i++) {
                    soma += produtos[i].getPreco();
                }
                media = soma / num;
                System.out.printf("A media dos preços inseridas e de : %.2f", media);
                break;
            case 4:
                //TODO DEMONSTRAÇÃO DA ULTILIZAÇÃO DE BOXING E UNBOXING
                int x = 20;
                Object obj = x;
                System.out.println(obj);
                int y = (int) obj;
                System.out.println(y);
                //TODO O UNBOXIN E BOZIN E FEITO DE FORMA NATURAL E SEM A UTILIZAÇÃO DO CASTIN USANDO O WRAPPER QUE SÃO CLASSES EQUIVALENTES AOS TIPOS PRIMITIVOS
                Integer Z = 20;
                break;
            case 5:
                //TODO USANDO O FOREACH
                String[] vect = new String[] {"Marta", "Alex", "Nicolas", "Duda"};
                System.out.println("RESULTADO USANDO UM FOR NORMAL:");
                for(i = 0; i < vect.length;i++){
                    System.out.println(vect[i]);
                }
                System.out.println("RESULTADTO USANDO UM FOR EACH:");
                for (String nomes : vect) {
                    System.out.println(nomes);
                }
                break;
            case 6:
                //TODO TRABALHANDO COM LISTA
                List<String> lista = new ArrayList<>();

                lista.add("Maria");
                lista.add("Alex");
                lista.add("Nicolas");
                lista.add("Duda");
                lista.add(2, "Eryck");


                System.out.println(lista.size());

                lista.remove("Nicolas");

                lista.removeIf(s -> s.charAt(0) == 'M');

                System.out.println("Pos remoção: " + lista.size());
                System.out.println("Posição de Eryck na lista é: " + lista.indexOf("Eryck"));
                for (String  list: lista){
                    System.out.println(list);
                }
                System.out.println("-----------------------------");
                List<String> resultado = lista.stream().filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());
                for (String  result: resultado){
                    System.out.println(result);
                }
                System.out.println("-----------------------------");
                String name = lista.stream().filter(s -> s.charAt(0) == 'A').findFirst().orElse(null);
                System.out.println("Primerio nome que começa com A da lista é:" + name);

        }

    }
}