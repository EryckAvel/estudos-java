package S10.exercicios.lista.application;

import S10.exercicios.lista.entity.Funcionario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramListFuncionarios {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int lim, i;
        System.out.print("Digite a quantidade de usuario que serão inseridos:");
        lim = Integer.parseInt(entrada.nextLine());
        List<Funcionario> funcionarios = new ArrayList<>();
        for (i = 0; i < lim; i++){
            System.out.println("Digitando os dados do #" + (1+i) + " funcionario:");
            System.out.print("Digite o Id do funcionario: ");
            int id = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite o nome do funcionario: ");
            String nome = entrada.nextLine();
            System.out.print("Digite o valor do salario do funcionario: ");
            double salario = Double.parseDouble(entrada.nextLine());
            funcionarios.add(new Funcionario(id, nome, salario));
        }
        System.out.print("Insira do ID do funcionario que deseje aumentar o salario: ");
        int id = Integer.parseInt(entrada.nextLine());
        Funcionario func = funcionarios.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        if(func == null){
            System.out.println("ID não foi encontrado!");
        }else{
            System.out.print("Digite quanto sera o aumento de salario: ");
            double porce = Double.parseDouble(entrada.nextLine());
            func.aumentoDeSalario(porce);
        }
        System.out.println("Funcionarios Registrados:");
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario.toString());
        }

    }

}
