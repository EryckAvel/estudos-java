package S14.exercicio.circulo.entity;

import S14.exercicio.circulo.enums.Cor;

public class Retangulo extends Forma{

    private Double largura;
    private Double altura;

    public Retangulo() {

    }

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura*altura;
    }

    @Override
    public String toString() {
        return "\nTipo de Forma: Retangulo" +
                "\nAltura: " + altura +
                "\nLargura: " + largura +
                "\nCor: " + cor +
                "\nArea: " + area();
    }
}
