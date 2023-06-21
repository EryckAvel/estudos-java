package S14.anotacoes.heranca.application;

import S14.anotacoes.heranca.entity.Conta;
import S14.anotacoes.heranca.entity.ContaEmpresarial;
import S14.anotacoes.heranca.entity.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Eryck", 0.0);
        ContaEmpresarial contaEmp = new ContaEmpresarial(1002, "Maria Eduarda", 0.0, 500.0);

        //TODO UPCASTING

        Conta conta1 = contaEmp;
        Conta conta2 = new ContaEmpresarial(1003, "Alex", 1000.0, 5000.0);
        Conta conta3 = new ContaPoupanca(1004, "Marta", 2000.0, 300.0);
        System.out.println(conta);
        System.out.println(contaEmp);
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

        //TODO DOWNCASTING

//        ContaEmpresarial ContaEmp1 = conta2; N funciona
        ContaEmpresarial contaEmp1 = (ContaEmpresarial) conta2;
        contaEmp1.emprestimo(100.0);
        System.out.println(contaEmp1);
        System.out.println("\n");
//        ContaEmpresarial contaEmp2 = (ContaEmpresarial) conta3;
//        System.out.println(contaEmp2); Por mais que o compildor não entenda o erro, na execução o erro seja jogado;

        //TODO Em resumo a super classe pode receber as subclasses agora uma subclasse n pode receber de uma super classe.

        if (conta3 instanceof ContaEmpresarial){
            ContaEmpresarial contaEmp2 = (ContaEmpresarial) conta3;
            contaEmp2.emprestimo(200.0);
            System.out.println("Emprestimo!");
        }

        if (conta3 instanceof ContaPoupanca){
            ContaPoupanca contaPoup = (ContaPoupanca) conta3;
            contaPoup.atualizarSaldo();
            System.out.println("Atualizado!");
        }

        //TODO Na situação a cima temos uma forma de reconhecer a instancia que recebemos no caso o instaneof faz essa verificação

        //TODO SOBREPOSIÇÃO E ETC

        Conta conta01 = new Conta(1001, "Alex", 1000.0);
        conta01.saque(200.0);
        System.out.println(conta01.getSaldo());
        Conta conta02 = new ContaPoupanca(1002, "Marta Maria", 2000.0, 0.01);
        conta02.saque(200.0);
        System.out.println(conta02.getSaldo());
        Conta conta03 = new ContaEmpresarial(1003, "Maria Eduarda", 1000.0, 2000.0);
        conta03.saque(200.0);
        System.out.println(conta03.getSaldo());

        //TODO FINAL
        //TODO O final colocado em uma classe impede que essa classse possa ser herdada
        //TODO Em metodo ele evita que ele possa ser sobreposto

        //TODO POLIMORFISMO

        Conta x = new Conta(1010, "Alex", 1000.0);
        Conta y = new ContaPoupanca(1020, "Marta", 2100.0, 0.01);

        x.saque(50.0);
        y.saque(50.0);
        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());

    }

}
