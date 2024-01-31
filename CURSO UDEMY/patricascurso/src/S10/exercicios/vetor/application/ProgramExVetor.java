package S10.exercicios.vetor.application;

import S10.exercicios.vetor.entity.Aluno;
import S10.exercicios.vetor.entity.Pessoa;

import java.util.Scanner;
import javax.swing.*;

public class ProgramExVetor {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 0, num;
        double soma = 0, media;
        System.out.println("Começando Exercicios sobre Vetor!");
        System.out.print("Digite qual Exercercio deseja realizar:");
        num = Integer.parseInt(entrada.nextLine());
        switch (num){
            case 1:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                int[] valores = new int[num];
                for (i = 0; i < num; i++){
                    System.out.print("Digite um número:");
                    valores[i] = Integer.parseInt(entrada.nextLine());
                }
                System.out.println("NUMEROS NEGATIVOS:");
                for (i = 0; i < num; i++){
                    if (valores[i] < 0){
                        System.out.println(valores[i]);
                    }
                }
                break;
            case 2:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                double[] numeros = new double[num];
                for (i = 0; i < num; i++){
                    System.out.print("Digite um número:");
                    numeros[i] = Double.parseDouble(entrada.nextLine());
                }
                System.out.print("VALORES: ");
                for (i = 0; i < num; i++){
                    System.out.printf("%.2f", numeros[i]);
                }
                System.out.println("");
                for (i = 0; i < num; i++){
                    soma += numeros[i];
                }
                media = soma/num;
                System.out.println("SOMA: " + soma);
                System.out.println("MEDIA: " + media);
                break;
            case 3:
                System.out.print("Digite a quantidade de pessoa que seram cadastradas:");
                num = Integer.parseInt(entrada.nextLine());
                Pessoa[] pessoas = new Pessoa[num];
                for (i = 0; i < num; i++){
                    System.out.println("Registrando a pessoa " + (i+1));
                    System.out.print("Digite o nome da pessoa:");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a idade da pessoa:");
                    int idade = Integer.parseInt(entrada.nextLine());
                    System.out.print("Digite a altura da pessoa:");
                    double altura = Double.parseDouble(entrada.nextLine());
                    pessoas[i] = new Pessoa(nome, idade, altura);
                }
                for (i = 0; i < num; i++){
                    soma += pessoas[i].getAltura();
                }
                media = soma/num;
                System.out.printf("A altura media e de: %.2f%n", media );
                int qtd_idade = 0;
                for (i = 0; i < num; i++){
                    if(pessoas[i].getIdade() < 16){
                        qtd_idade += 1;
                    }
                }
                double percentualMenores = ((double) qtd_idade/num) * 100;
                System.out.println("A porcentagem de pessoas menores de 16 anos e de: " + percentualMenores + "%");
                for (i = 0; i < num; i++){
                    if(pessoas[i].getIdade() < 16){
                        System.out.println(pessoas[i].getNome());
                    }
                }
                break;
            case 4:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                int[] val = new int[num];
                for (i = 0; i < num; i++){
                    System.out.print("Digite o " + (i+1) + " numero: ");
                    val[i] = Integer.parseInt(entrada.nextLine());
                }
                System.out.print("Numeros Pares: ");
                for (i = 0; i < num; i++){
                    if (val[i]%2 == 0){
                        soma++;
                        System.out.print(val[i]+" ");
                    }
                }
                System.out.println("");
                System.out.println("Quantidade de Numeros Pares: " + soma);
                break;
            case 5:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                int[] numbs = new int[num];
                for (i = 0; i < num; i++){
                    System.out.print("Digite o " + (i+1) + " numero: ");
                    numbs[i] = Integer.parseInt(entrada.nextLine());
                }
                int maior = numbs[0];
                int posmaior = 0;
                for (i=1; i< num; i++) {
                    if (numbs[i] > maior) {
                        maior = numbs[i];
                        posmaior = i;
                    }
                }
                System.out.println("MAIOR VALOR = " + maior);
                System.out.println("POSICAO DO MAIOR VALOR = " + posmaior);
                break;
            case 6:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                int[] vA = new int[num];
                int[] vB = new int[num];
                System.out.println("Digite os valores de A:");
                for (i=0; i< num; i++){
                    System.out.print("Valor " + (i+1) + ": ");
                    vA[i] = Integer.parseInt(entrada.nextLine());
                }
                System.out.println("Digite os valores de B:");
                for (i=0; i< num; i++){
                    System.out.print("Valor " + (i+1) + ": ");
                    vB[i] = Integer.parseInt(entrada.nextLine());
                }
                for (i=0; i< num; i++){
                    soma = vA[i] + vB[i];
                    System.out.println("SOMA DE A E B DA POSIÇÃO " + (i+1) + ": " + soma);
                }
                System.out.println("Vetores Resultantes");
                break;
            case 7:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                double[] elementos = new double[num];
                for (i=0; i< num; i++){
                    System.out.print("Digite um numero:");
                    elementos[i] = Double.parseDouble(entrada.nextLine());
                }
                for (i=0; i< num; i++){
                    soma += elementos[i];
                }
                media = soma/num;
                System.out.printf("MEDIAS DOS ELEMENTOS: %.2f%n", media);
                System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
                for (i=0; i< num; i++){
                    if (elementos[i] < media){
                        System.out.println(elementos[i]);
                    }
                }
                break;
            case 8:
                System.out.print("Digite a quantidade de números que sera digitada:");
                num = Integer.parseInt(entrada.nextLine());
                int[] vetor = new int[num];
                for (i=0; i< num; i++){
                    System.out.print("Digite um numero:");
                    vetor[i] = Integer.parseInt(entrada.nextLine());
                }
                int par = 0;
                for (i=0; i< num; i++){
                    if (vetor[i]%2 == 0){
                        par ++;
                    }
                }
                if (par != 0){
                    for (i=0; i< num; i++){
                        if (vetor[i]%2 == 0) {
                            soma += vetor[i];
                        }
                    }
                    media = soma/par;
                    System.out.printf("MEDIA DOS PARES: %.2f%n", media);
                }else{
                    System.out.println("SEM NUMEROS PARES!");
                }
                break;
            case 9:
                System.out.print("Digite a quantidade de pessoa que seram cadastradas:");
                num = Integer.parseInt(entrada.nextLine());
                Pessoa[] pessoas2 = new Pessoa[num];
                for (i=0; i< num; i++){
                    System.out.println("Digite os dados da " + (1+i) + "a pessoa:");
                    System.out.print("Nome:");
                    String nome = entrada.nextLine();
                    System.out.print("Idade:");
                    int idade = Integer.parseInt(entrada.nextLine());
                    pessoas2[i] = new Pessoa(nome, idade);
                }
                int maioridade = pessoas2[0].getIdade();
                posmaior = 0;
                for (i=1; i<num; i++) {
                    if (pessoas2[i].getIdade() > maioridade) {
                        maioridade = pessoas2[i].getIdade();
                        posmaior = i;
                    }
                }
                System.out.println("A pessoa mais velha e: " + pessoas2[posmaior].getNome());
                break;
            case 10:
                System.out.print("Digite a quantidade de Alunos:");
                num = Integer.parseInt(entrada.nextLine());
                Aluno[] alunos = new Aluno[num];
                for (i = 0; i < num; i++){
                    System.out.println("Aluno " + (i+1) + ":");
                    System.out.print("Digite o Nome do aluno:");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a nota do primerio semestre:");
                    double nota1 = Double.parseDouble(entrada.nextLine());
                    System.out.print("Digite a nota do segundo semestre:");
                    double nota2 = Double.parseDouble(entrada.nextLine());
                    alunos[i] = new Aluno(nome, nota1, nota2);
                }
                System.out.println("Alunos Aprovados");
                for (i = 0; i < num; i++){
                    soma = alunos[i].getNota1() + alunos[i].getNota2();
                    media = soma/num;
                    if (media > 6.0){
                        System.out.println(alunos[i].getNome());
                    }
                }
                break;
        }
    }

}
