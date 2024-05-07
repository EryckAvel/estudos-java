package S18.anotacao.formas.model;

import S18.anotacao.formas.enums.Cor;

public abstract class AbstractForma implements Forma{

    private Cor cor;

    public AbstractForma() {
    }

    public AbstractForma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

}
