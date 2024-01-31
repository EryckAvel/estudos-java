package S13.anotacoes.application;

import S13.anotacoes.entity.Pedido;
import S13.anotacoes.enums.OrdemDeStatus;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1080L, LocalDate.now(), OrdemDeStatus.PAGAMENTO_PENDENTE);
        System.out.println(pedido.toString());
        OrdemDeStatus os1 = OrdemDeStatus.PAGAMENTO_PENDENTE;
        OrdemDeStatus os2 = OrdemDeStatus.valueOf("PAGAMENTO_PENDENTE");
        System.out.println(os1);
        System.out.println(os2);
    }

}
