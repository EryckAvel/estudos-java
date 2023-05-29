package S8.funcionarios.entity;

public class Funcionario {

    public String nome;
    public double salariobruto;
    public double taxa;

    public double netSalary(){
        return salariobruto - taxa;
    }

    public void aumentoDeSalario(double procentagem){
        salariobruto += salariobruto * procentagem/100;
    }

    @Override
    public String toString() {
        return nome + ", $" + String.format("%.2f", netSalary());
    }
}
