package S9.exercicios.banco.entity;

public class Conta {

    private String numeroConta;
    private String nomeTitular;
    private Double saldo;

    public Conta() {
    }

    public Conta(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public Conta(String numeroConta, String nomeTitular, Double deposito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = deposito;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double valor){
        saldo = (saldo - valor) - 5;
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        return "Numero de Conta: " + numeroConta + ", Nome: " + nomeTitular + ", Saldo Atual:" + saldo;
    }
}
