package S18.anotacao.locadora.forma2.model.forma1.app;

import S18.anotacao.locadora.forma1.model.forma1.services.TaxaBrazileiraService;
import S18.anotacao.locadora.forma2.model.forma1.model.AluguelCarro;
import S18.anotacao.locadora.forma2.model.forma1.model.Veiculo;
import S18.anotacao.locadora.forma2.model.forma1.services.AluguelService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDateTime.parse;

public class AppLocadora {

    private static final Scanner entrada = new Scanner(System.in);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        double valorhora;
        double valorpordia;
        System.out.println("--------- LOCADORA DE CARRO ---------");
        System.out.print("Digite o modelo do carro: ");
        String carromodelo = entrada.nextLine();
        System.out.println("------------> DATAS");
        System.out.print("Digite a data de Retirada: " );
        LocalDateTime retirada = parse(entrada.nextLine(),dtf);
        System.out.print("Digite a data de retorno: ");
        LocalDateTime retorno = parse(entrada.nextLine(), dtf);
        System.out.println("------------> VALORES");
        System.out.print("Digite o valor por hora: ");
        valorhora = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite o valor por dia: ");
        valorpordia = Double.parseDouble(entrada.nextLine());
        AluguelCarro aluguel = new AluguelCarro(retirada, retorno, new Veiculo(carromodelo));
        AluguelService aluguelService = new AluguelService(valorhora, valorpordia, new TaxaBrazileiraService());
        aluguelService.processarFatura(aluguel);
        System.out.println("------------> FATURA : ");
        System.out.println("Pagamento basico : " + aluguel.getFatura().getValor());
        System.out.println("Taxa : " + aluguel.getFatura().getTaxa());
        System.out.println("Pagamento Total : " + aluguel.getFatura().getValortotal());
    }

}
