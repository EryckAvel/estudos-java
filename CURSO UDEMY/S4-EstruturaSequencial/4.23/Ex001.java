import java.util.Locale;

public class Ex001 {
    
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de trabalho";
        int idade = 20;
        int code = 5290;
        char sexo = 'M';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        
        System.out.println("Produtos:");
        System.out.printf("%s , seu preço e de: %.2f%n", produto1, preco1);
        System.out.printf("%s , seu preço e de: %.2f%n", produto2, preco2);
        System.out.printf("Gravando: %d anos de idade, codigo %d e sexo: %c%n", idade, code, sexo);
        System.out.printf("Medida com todas as casas decimais %f%n", medida);
        System.out.printf("Medida com 3 casas decimais %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Decimal estilo US: %.3f", medida);
    }

}
