package S15.exercicio.conta.model.entity;

import S15.exercicio.conta.model.exception.ValueNullException;
import S15.exercicio.conta.model.exception.WithdrawalAmountLimitException;

public class Conta {

    private Integer numeroDaConta;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta() {
    }

    public Conta(Integer numeroDaConta, String titular, Double saldo, Double limiteDeSaque) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void depositor(Double valor){
        saldo += valor;
    }

    public void saque(Double valor){
        if (valor > limiteDeSaque){
            throw new WithdrawalAmountLimitException("Limite de valor superior ao valor limite de saque da conta!");
        }else if (valor > saldo) {
            throw new ValueNullException("Valor existente na conta inferior ao valor requisitado!");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "\nNumero da Conta: " + numeroDaConta +
                "\nNome do Titular: " + titular +
                "\nSaldo Atual: " + saldo +
                "\nLimite de Saque: " + limiteDeSaque;
    }
}
