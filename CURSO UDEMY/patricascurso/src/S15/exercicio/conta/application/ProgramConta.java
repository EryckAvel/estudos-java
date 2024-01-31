package S15.exercicio.conta.application;

import S15.exercicio.conta.model.entity.Conta;
import S15.exercicio.conta.model.exception.ValueNullException;
import S15.exercicio.conta.model.exception.WithdrawalAmountLimitException;

import java.util.Scanner;

public class ProgramConta {

    static Scanner entrada =  new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----- BRADESCO -----");
        System.out.print("Numero da Conta: ");
        Integer numero = Integer.parseInt(entrada.nextLine());
        System.out.print("Nome do Titular: ");
        String titular = entrada.nextLine();
        System.out.print("Saldo Atual: ");
        Double saldo = Double.parseDouble(entrada.nextLine());
        System.out.print("Limite de saque:");
        Double limite = Double.parseDouble(entrada.nextLine());
        Conta conta = new Conta(numero, titular, saldo, limite);
        System.out.println(conta);
        System.out.println("\nQuanto Deseja sacar de sua conta?");
        System.out.print("Valor:");
        try {
            Double valor = Double.parseDouble(entrada.nextLine());
            conta.saque(valor);
            System.out.println(conta);
        }catch (WithdrawalAmountLimitException w){
            System.out.println(w.getMessage());
        }catch (ValueNullException v){
            System.out.println(v.getMessage());
        }
    }

}
