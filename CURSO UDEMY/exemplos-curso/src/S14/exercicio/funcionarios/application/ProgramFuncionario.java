package S14.exercicio.funcionarios.application;

import S14.exercicio.funcionarios.entity.Funcionario;
import S14.exercicio.funcionarios.entity.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramFuncionario {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------ Cadastro de Funcionario ------------\n");
        System.out.print("Insira a quantidade de funcionarios: ");
        Integer lim = Integer.parseInt(entrada.nextLine());
        List<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 0; i < lim; i++){
            System.out.println("\n-----------------------------------------------\n");
            System.out.println("Digite os dados do #" + (i+1) + " funcionario: ");
            System.out.print("Tercerizado (S/N): ");
            String cond = entrada.nextLine();
            if (cond.equals("S")){
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Horas: ");
                Integer horas = Integer.parseInt(entrada.nextLine());
                System.out.print("Valor por hora: ");
                Double valor = Double.parseDouble(entrada.nextLine());
                System.out.print("Despesas adicionais: ");
                Double valorAdd = Double.parseDouble(entrada.nextLine());
                funcionarios.add(new FuncionarioTercerizado(nome, horas, valor, valorAdd));
            }else{
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Horas: ");
                Integer horas = Integer.parseInt(entrada.nextLine());
                System.out.print("Valor por hora: ");
                Double valor = Double.parseDouble(entrada.nextLine());
                funcionarios.add(new Funcionario(nome, horas, valor));
            }
        }
        System.out.println("\n----------- Pagamento dos Funcionarios -----------");
        for (Funcionario funcionario: funcionarios) {
            System.out.println(funcionario);
        }
    }

}
