package S8.alunonotas.application;

import S8.alunonotas.entity.AlunoNotas;

import java.util.Scanner;

public class ProgramAlunoNotas {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        AlunoNotas aluno = new AlunoNotas();
        System.out.println("Digite os dados do aluno:");
        System.out.print("Nome:");
        aluno.nome = entrada.nextLine();
        System.out.print("Nota do Primeiro Semestre:");
        aluno.notaum = Double.parseDouble(entrada.nextLine());
        System.out.print("Nota do Segundo Semestre:");
        aluno.notadois = Double.parseDouble(entrada.nextLine());
        System.out.print("Nota do terceiro Semestre:");
        aluno.notatres = Double.parseDouble(entrada.nextLine());

        System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

        if(aluno.notaFinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("FALTO %.2f PONTOS%n", aluno.validarPontos());
        }else{
            System.out.println("APROVADO");
        }

    }

}
