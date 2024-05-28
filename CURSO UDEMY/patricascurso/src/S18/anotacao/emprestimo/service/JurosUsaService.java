package S18.anotacao.emprestimo.service;

import java.security.InvalidParameterException;

public class JurosUsaService implements JurosService{

    private double taxasJuros;

    public JurosUsaService(double taxasJuros) {
        this.taxasJuros = taxasJuros;
    }

    @Override
    public double getTaxasJuros() {
        return taxasJuros;
    }

}
