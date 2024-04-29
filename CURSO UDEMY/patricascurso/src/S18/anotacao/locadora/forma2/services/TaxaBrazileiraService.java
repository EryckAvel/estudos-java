package S18.anotacao.locadora.forma2.services;

public class TaxaBrazileiraService {

    public double taxa(double montante){
        if (montante <= 100.0){
            return montante * 0.2;
        }
        else{
            return montante * 0.15;
        }
    }

}
