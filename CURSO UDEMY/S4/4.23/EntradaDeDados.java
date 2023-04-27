import java.util.Locale;

public class EntradaDeDados {

    public static void main(String[] args) {
        System.out.print("Olá, Mundo!");
        System.out.println("Bom dia!");
        
        int x = 30;
        System.out.println(x);

        Locale.setDefault(Locale.US);
        double y = 20.352548;
        System.out.printf("%.2f ou %.3f%n", y,y);

        System.out.println("RESULTADO: " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", y);

        String nome = "Maria";
        int idade = 20;
        double renda = 10400.5467;
        System.out.printf("%s TEM %d ANOS E GANHA R$ %.2f REAIS%n", nome, idade, renda);

    }
    
}
