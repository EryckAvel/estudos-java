package S14.anotacoes.abstracao.application;

import S14.anotacoes.abstracao.entity.Conta;
import S14.anotacoes.abstracao.entity.ContaEmpresarial;
import S14.anotacoes.abstracao.entity.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ProgramAbstracao {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();
        lista.add(new ContaPoupanca(1001, "Alex", 10.0, 0.01));
        lista.add(new ContaEmpresarial(1002, "Marta", 100.00, 500.00));
        lista.add(new ContaPoupanca(1003, "Maria Eduarda", 100.00, 0.01));
        lista.add(new ContaEmpresarial(1004, "Eryck", 1000.0, 1200.0));

        double sum = 0.0;
        for (Conta conta: lista){
            sum += conta.getSaldo();
        }

        System.out.println(sum);
    }

}
