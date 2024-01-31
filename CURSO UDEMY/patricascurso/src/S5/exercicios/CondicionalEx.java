package S5.exercicios;

import java.util.Scanner;

public class CondicionalEx {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int ex;
        System.out.println("Escolha um exemplo de 1 a 8 para testar!");
        System.out.println("Qual exemplo deseja ver:");
        ex = Integer.parseInt(entrada.nextLine());
        int num;
        switch (ex){
            case 1:
                System.out.println("Digite um número:");
                num = Integer.parseInt(entrada.nextLine());
                if (num < 0){
                    System.out.println("NEGATIVO!");
                }else{
                    System.out.println("NÃO NEGATIVO!");
                }
                break;
            case 2:
                System.out.println("Digite um número:");
                num = Integer.parseInt(entrada.nextLine());
                if (num % 2 ==0){
                    System.out.println("PAR");
                }else{
                    System.out.println("IMPAR");
                }
                break;
            case 3:
                int a,b;
                System.out.println("Verificar se dois números são mutiplos!");
                System.out.println("Digite o primero número:");
                a = Integer.parseInt(entrada.nextLine());
                System.out.println("Digite o segundo número:");
                b = Integer.parseInt(entrada.nextLine());
                if (a % b == 0 || b % a == 0){
                    System.out.println("SÃO MULTIPLOS!");
                }else{
                    System.out.println("NÃO SÃO MULTIPLOS");
                }
                break;
            case 4:
                int horaInicial, horaFinal, duracao;
                System.out.println("Vamos calcular o tempo de duração de um jogo!");
                System.out.println("Digite a hora de inicio:");
                horaInicial = Integer.parseInt(entrada.nextLine());
                System.out.println("Digite a hora de termino:");
                horaFinal = Integer.parseInt(entrada.nextLine());
                if (horaInicial < horaFinal){
                    duracao = horaFinal - horaInicial;
                }else{
                    duracao = 24 - horaInicial + horaFinal;
                }
                System.out.println("O JOGO DURO " + duracao + " HORA(S)!");
                break;
            case 5:
                int cod, qtd;
                double total = 0;
                System.out.println("------------- TABELA DE PREÇOS -------------");
                System.out.println("------ 1 -- CachorroQuente -- R$ 4.00 ------");
                System.out.println("------ 2 -- X-salada -------- R$ 4.50 ------");
                System.out.println("------ 3 -- X-Bacon --------- R$ 5.00 ------");
                System.out.println("------ 4 -- Torrada Simpels - R$ 2.00 ------");
                System.out.println("------ 5 -- Refrigerante ---- R$ 1.50 ------");
                System.out.println("------------- FAÇA SEU PEDIDO --------------");
                System.out.println("Codigo do produto:");
                cod = Integer.parseInt(entrada.nextLine());
                System.out.println("Digite a quantidade:");
                qtd = Integer.parseInt(entrada.nextLine());
                if (cod == 1){
                    total = qtd * 4.0;
                }else if (cod == 2){
                    total = qtd * 4.5;
                }else if (cod == 3){
                    total = qtd * 5.0;
                }else if (cod == 4){
                    total = qtd * 2.0;
                }else if (cod == 5){
                    total = qtd * 1.5;
                }
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 6:
                System.out.println("Digite um número:");
                num = Integer.parseInt(entrada.nextLine());
                if (num > 0 && num <= 25){
                    System.out.println("INTERVALO [0,25]");
                }else if (num > 25 && num <= 50){
                    System.out.println("INTERVALO [25,50]");
                }else if (num > 50 && num <= 75){
                    System.out.println("INTERVALO [50,75]");
                }else if (num > 75 && num <= 100){
                    System.out.println("INTERVALO [75,100]");
                }else{
                    System.out.println("FORA DO INTERVALO!");
                }
                break;
            case 7:
                double x, y;
                System.out.println("Descubra o quadrante!");
                System.out.println("Digite o primeiro valor:");
                x = Double.parseDouble(entrada.nextLine());
                System.out.println("Digite o segundo valor:");
                y = Double.parseDouble(entrada.nextLine());
                if (x > 0 && y > 0){
                    System.out.println("Q1");
                }else if (x < 0 && y > 0){
                    System.out.println("Q2");
                } else if (x < 0 && y < 0){
                    System.out.println("Q3");
                }else if (x > 0 && y < 0){
                    System.out.println("Q4");
                }else if (x == 0 && y == 0){
                    System.out.println("ORIGEM");
                }
                break;
            case 8:
                double salario, imposto;
                System.out.println("Vamos calcular o valor de imposto aparti do seu salario!");
                System.out.println("Digite o valor do seu salario: ");
                salario = Double.parseDouble(entrada.nextLine());
                if (salario <= 2000.00){
                    imposto = 0.0;
                }else if (salario <= 3000.0) {
                    imposto = (salario - 2000.0) * 0.08;
                }
                else if (salario <= 4500.0) {
                    imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
                }
                else {
                    imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
                }
                if (imposto == 0.0){
                    System.out.println("INSENTO");
                }else{
                    System.out.printf("VALOR DE IMPOSTO SOBRE SALARIO É : R$ %.2f%n", imposto);
                }
                break;
            default:
                System.out.println("Exercicio Não Encontrado!");
        }

    }


}
