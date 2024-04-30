package S18.excercicio.ex001.service;

public class PayPalService implements PagamentoService {

    @Override
    public double taxaPagamento(double valor) {
        return valor + (valor * 0.02);
    }

    @Override
    public double juros(double valor, int parcela) {
        return valor + (valor * 0.01) * parcela;
    }

}
