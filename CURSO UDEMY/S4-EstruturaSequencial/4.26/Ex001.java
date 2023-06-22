import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String sobrenome;
        int idade;
        double salario;
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobrenome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite sua meida salarial:");
        salario = Double.parseDouble(entrada.nextLine());
        System.out.println("Prazer " + nome + " " + sobrenome + ", voçê tem " + idade + ", sua media salarial e de " + salario + "reais");
    }
    
}
