package S8.anotacoes.circulo.util;

public class Calculador {

    public final double PI = 3.14159;

    public double circuferencia(double r){
        return 2*PI*r;
    }

    public double volume(double r){
        return 4 * PI * r *r *r/3;
    }


}
