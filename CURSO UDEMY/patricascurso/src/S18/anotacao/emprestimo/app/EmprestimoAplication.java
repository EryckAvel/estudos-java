package S18.anotacao.emprestimo.app;

import S18.anotacao.emprestimo.service.JurosBrazilService;
import S18.anotacao.emprestimo.service.JurosService;
import S18.anotacao.emprestimo.service.JurosUsaService;

import java.util.Scanner;

public class EmprestimoAplication {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------- EMPRESTIMO -------------");
        System.out.print("Montante : ");
        double montante = Double.parseDouble(entrada.nextLine());
        System.out.print("Meses : ");
        int meses = Integer.parseInt(entrada.nextLine());
        JurosService juros = new JurosUsaService(1.0);
        double pagamento = juros.pagamento(montante, meses);
        System.out.println("Pagamento apos " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));
    }

}
