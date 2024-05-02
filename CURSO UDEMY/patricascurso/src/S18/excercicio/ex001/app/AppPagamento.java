package S18.excercicio.ex001.app;

import S18.excercicio.ex001.model.Contrato;
import S18.excercicio.ex001.model.Parcela;
import S18.excercicio.ex001.service.ContratoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDate.parse;

public class AppPagamento {

    private static Scanner entrada = new Scanner(System.in);
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        System.out.println("-------------- PAGAMENTOS --------------");
        System.out.print("Numero do contrato : ");
        int numcontrato = Integer.parseInt(entrada.nextLine());
        System.out.print("Data (DD/MM/YYYY) : ");
        LocalDate datacontrato = parse(entrada.nextLine(), dtf);
        System.out.print("Valor do contrato : ");
        double valorcontrato = Double.parseDouble(entrada.nextLine());
        System.out.print("Entre com o numero de parcelas: ");
        int qtdparcela = Integer.parseInt(entrada.nextLine());
        ContratoService contratoService = new ContratoService();
        Contrato contrato = new Contrato(numcontrato, datacontrato, valorcontrato);
        contratoService.processarContratos(contrato, qtdparcela);
        System.out.println("-------------- PARCELAS --------------");
        for (Parcela parcela : contrato.getParcelas()){
            System.out.println(parcela.toString());
        }
    }

}
