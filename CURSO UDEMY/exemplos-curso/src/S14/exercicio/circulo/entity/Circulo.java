package S14.exercicio.circulo.entity;

import S14.exercicio.circulo.enums.Cor;

public class Circulo extends Forma{

    private Double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI*raio*raio;
    }

    @Override
    public String toString() {
        return "\nTipo de Forma: Circulo" +
                "\nRaio: " + raio +
                "\nCor: " + cor +
                "\nArea: " + area();
    }

}
