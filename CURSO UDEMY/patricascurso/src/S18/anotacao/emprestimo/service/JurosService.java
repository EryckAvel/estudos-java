package S18.anotacao.emprestimo.service;

import java.security.InvalidParameterException;

public interface JurosService {

    double getTaxasJuros();

    default double pagamento(double montante, int meses){
        if(meses <1) throw new InvalidParameterException("Meses tem que ser maior que 0!");
        return montante * Math.pow(1.0 + getTaxasJuros()/100, meses);
    }

}
