package S18.anotacao.emprestimo.service;

public class JurosBrazilService implements JurosService{

    private double taxasJuros;

    public JurosBrazilService(double taxasJuros) {
        this.taxasJuros = taxasJuros;
    }

    @Override
    public double getTaxasJuros() {
        return taxasJuros;
    }

}
