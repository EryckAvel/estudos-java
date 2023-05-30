package S8.exercicio.cotação.util;

public class Cotacao {

    public static double IMPOSTO = 0.06;

    public static double convercaoDeCotacao(double c, double v){
        return c*v + IMPOSTO*(c*v);
    }

}
