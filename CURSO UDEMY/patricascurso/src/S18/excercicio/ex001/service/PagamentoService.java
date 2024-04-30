package S18.excercicio.ex001.service;

public interface PagamentoService {

    double taxaPagamento(double valor);
    double juros(double valor, int parcela);

}
