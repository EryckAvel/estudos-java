import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        char sexo;
        System.out.println("Digite seu Nome:");        
        nome = entrada.nextLine();
        System.out.println("Digite sua Idade:");
        idade = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite sua Altura:");
        altura = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite seu Sexo:");
        sexo = entrada.nextLine().charAt(0);
        System.out.println
        ("Olá, " + nome + 
        " vc tem " + idade + 
        " anos, voçê tem " + altura + 
        " m de altura, do sexo " + sexo);
        entrada.close();
    }
    
}