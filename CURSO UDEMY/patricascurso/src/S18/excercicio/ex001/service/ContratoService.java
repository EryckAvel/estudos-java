package S18.excercicio.ex001.service;

import S18.excercicio.ex001.model.Contrato;
import S18.excercicio.ex001.model.Parcela;

public class ContratoService {

    public void processarContratos(Contrato contrato, int qtdparcela){
        double valorparcela = contrato.getTotal()/qtdparcela;
        for (int i = 1; i <= qtdparcela; i++){
            Parcela parcela = new Parcela();
            parcela.setData(contrato.getData().plusMonths(i));
            parcela.setPagamento(new PayPalService());
            double juros = parcela.getPagamento().juros(valorparcela, i);
            double taxa = parcela.getPagamento().taxaPagamento(juros);
            parcela.setValor(taxa);
            contrato.getParcelas().add(parcela);
        }
    }

}
