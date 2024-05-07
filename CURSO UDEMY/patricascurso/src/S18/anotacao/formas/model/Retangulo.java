package S18.anotacao.formas.model;

import S18.anotacao.formas.enums.Cor;

public class Retangulo extends AbstractForma{

    private Double largura;
    private Double altura;

    public Retangulo() {
    }

    public Retangulo(Cor color, Double largura, Double altura) {
        super(color);
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
        return largura * altura;
    }

    @Override
    public String toString() {
        return "------------ RETANGULO ------------\n" +
                "Largura : " + String.format("%.2f",getLargura()) + "\n" +
                "Altura : " + String.format("%.2f",getAltura()) + "\n" +
                "cor : " + getCor() + "\n" +
                "Area : " + String.format("%.2f",area()) + "\n";
    }

}
