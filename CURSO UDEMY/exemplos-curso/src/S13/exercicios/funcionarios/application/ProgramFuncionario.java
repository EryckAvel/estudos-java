package S13.exercicios.funcionarios.application;

import S13.exercicios.funcionarios.entity.Contrato;
import S13.exercicios.funcionarios.entity.Departamento;
import S13.exercicios.funcionarios.entity.Funcionario;
import S13.exercicios.funcionarios.enums.NivelExperiencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramFuncionario {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Funcionario func = new Funcionario();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\n");
        System.out.println("---------- Cadastro de Departamento ----------");
        System.out.print("Digite o nome do departamento: ");
        String depNome = entrada.nextLine();
        System.out.println("\n");
        System.out.println("---------- Cadastro de Funcionario -----------");
        System.out.print("Nome do(a) Funcionario(a): ");
        String nomeFunc = entrada.nextLine();
        func.setNome(nomeFunc);
        System.out.print("Nivel de Experiencia: ");
        NivelExperiencia nivel = NivelExperiencia.valueOf(entrada.nextLine());
        func.setNivel(nivel);
        System.out.print("Base salarial: ");
        Double salario = Double.parseDouble(entrada.nextLine());
        func.setSalarioBase(salario);
        func.setDepartamento(new Departamento(depNome));
        System.out.println("\n");
        System.out.println("---------- Contrato de Horas -----------------");
        System.out.print("Quantidade de contratos desse funcionario: ");
        int lim = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i < lim; i++) {
            System.out.println("Digite os dados do #" + (i + 1) + " contrato: ");
            System.out.print("Digite a Date do Contrato (DD/MM/yyyy): ");
            Date data = sdf1.parse(entrada.nextLine());
            System.out.print("Digite o valor por hora: ");
            Double valor = Double.parseDouble(entrada.nextLine());
            System.out.print("Digite a quantidade de horas: ");
            Integer horas = Integer.parseInt(entrada.nextLine());
            var cont = new Contrato(data, valor, horas);
            func.adicionarContrato(cont);
        }
        System.out.println("\n");
        System.out.println("---------- Verificando Renda Por Data ----------");
        System.out.print("Digite o Ano e Mes de Renda que deseja consultar (MM/YYYY): ");
        String mesAno = entrada.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome do Funcionario: " + func.getNome());
        System.out.println("Nome do Departamento: " + func.getDepartamento().getNome());
        System.out.println("A renda na data " + mesAno + ": " + func.renda(ano, mes));
        System.out.println("\n");
        System.out.println("---------- Dados Finais ----------");
        System.out.println(func.toString());
    }


}
