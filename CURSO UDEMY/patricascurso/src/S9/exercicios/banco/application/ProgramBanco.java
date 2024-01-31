package S9.exercicios.banco.application;

import S9.exercicios.banco.entity.Conta;

import java.util.Scanner;

public class ProgramBanco {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Conta conta;
        double valor;

        System.out.println("Bem Vindo ao Nosso Banco!");
        System.out.print("Insira o numero da conta:");
        String numero = entrada.nextLine();
        System.out.print("Insiera o nome do titular:");
        String nome = entrada.nextLine();
        System.out.print("Deseja informar o valor de saldo Inicial?[y/n]");
        String condicao = entrada.nextLine();
        if (condicao.equals("y")) {
            System.out.print("Informe o valor incial de seu saldo:");
            double saldo =  Double.parseDouble(entrada.nextLine());
            conta = new Conta(numero, nome, saldo);
        }else{
            conta = new Conta(numero, nome);
        }

        System.out.println("Dados Da Conta:");
        System.out.println(conta.toString());

        System.out.print("Digite o valor de deposito:");
        valor =  Double.parseDouble(entrada.nextLine());
        conta.deposito(valor);
        System.out.println(conta.toString());

        System.out.println("Digite o valor de saque:");
        valor = Double.parseDouble(entrada.nextLine());
        conta.saque(valor);
        System.out.println(conta.toString());

    }

}
