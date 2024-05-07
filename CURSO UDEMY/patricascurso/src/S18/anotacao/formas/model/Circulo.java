package S18.anotacao.formas.model;

import S18.anotacao.formas.enums.Cor;

public class Circulo extends AbstractForma{

    private Double raio;

    public Circulo() {
    }

    public Circulo(Cor color, Double radius) {
        super(color);
        this.raio = radius;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio.doubleValue(), 2.0);
    }

    @Override
    public String toString() {
        return "------------ CIRCULO ------------\n" +
                "raio : " + getRaio() + "\n" +
               "Area : " + String.format("%.2f",area()) + "\n" +
                "cor : " + getCor() + "\n";
    }

}
