package S8.anotacoes.circulo.util;

public class CalculadorStatic {

    public static final double PI = 3.14159;

    public static double circuferencia(double r){
        return 2*PI*r;
    }

    public static double volume(double r){
        return 4 * PI * r *r *r/3;
    }


}
