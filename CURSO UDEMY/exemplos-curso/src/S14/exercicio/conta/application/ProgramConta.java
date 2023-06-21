package S14.exercicio.conta.application;

import S14.exercicio.conta.entity.Pessoa;
import S14.exercicio.conta.entity.PessoaFisica;
import S14.exercicio.conta.entity.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramConta {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("--------------- Imposto de Renda ---------------\n");
        System.out.print("Quantas pessoas realizarão o imposto de renda: ");
        Integer lim = Integer.parseInt(entrada.nextLine());
        System.out.println("\n--------------- Cadastro de Pessoa ---------------\n");
        for (int i = 0; i < lim; i++){
            System.out.println("--------------- #" + (i+1) + " Pessoa ---------------\n");
            System.out.print("Pessoa Juridica ou Fisica (J/F): ");
            String resposta = entrada.nextLine();
            System.out.print("\nNome: ");
            String nome = entrada.nextLine();
            System.out.print("Renda Anual: ");
            Double renda = Double.parseDouble(entrada.nextLine());
            switch (resposta){
                case "F":
                    System.out.print("Gasto Medico: ");
                    Double gasto = Double.parseDouble(entrada.nextLine());
                    pessoas.add(new PessoaFisica(nome, renda, gasto));
                    break;
                case "J":
                    System.out.print("Numero de Funcionario: ");
                    Integer funcionarios = Integer.parseInt(entrada.nextLine());
                    pessoas.add(new PessoaJuridica(nome, renda, funcionarios));
                    break;
                default:
                    System.out.println("Tipo de pessoa não encontrada!");
            }
        }
        System.out.println("\n--------------- RESULTADOS ---------------\n");
        int i = 0;
        for(Pessoa pessoa: pessoas){
            System.out.println("--------------- #" + (i+1) + " Pessoa ---------------");
            System.out.println(pessoa);
            i++;
        }
        System.out.println("\n--------------- VALOR TOTAL ---------------\n");
        Double valorTotal = 0.0;
        for(Pessoa pessoa: pessoas){
            valorTotal += pessoa.taxa();
        }
        System.out.println("Total: " + String.format("%.2f",valorTotal));
    }

}
