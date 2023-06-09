package S14.exercicio.circulo.entity;

import S14.exercicio.circulo.enums.Cor;

public abstract class Forma {

    protected Cor cor;

    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();

}
