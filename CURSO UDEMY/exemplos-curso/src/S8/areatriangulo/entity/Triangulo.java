package S8.areatriangulo.entity;

public class Triangulo {

    //todo Uma entidade com seus atributos

    public double a;
    public double b;
    public double c;

    //todo Metodo que retiramos da classe pai para estar atribuida a classe triangulo

    public double area(){
        double p = (a + b + c)/2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }


}
