package S8.funcionarios.application;

import S8.funcionarios.entity.Funcionario;

import java.util.Scanner;

public class ProgramFuncionario {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double percentual;
        Funcionario f = new Funcionario();
        System.out.println("Insira dos dados do funcionario:");
        System.out.print("Nome:");
        f.nome = entrada.nextLine();
        System.out.print("Salario Bruto:");
        f.salariobruto = Double.parseDouble(entrada.nextLine());
        System.out.print("Taxa:");
        f.taxa = Double.parseDouble(entrada.nextLine());
        System.out.println("Funcionario: " + f.toString());
        System.out.print("De quanto sera o aumento de salario do funcionario:");
        percentual = Double.parseDouble(entrada.nextLine());
        f.aumentoDeSalario(percentual);
        System.out.println("Atualização: " + f.toString());
    }

}
