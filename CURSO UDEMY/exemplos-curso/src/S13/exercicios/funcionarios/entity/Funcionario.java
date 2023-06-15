package S13.exercicios.funcionarios.entity;

import S13.exercicios.funcionarios.enums.NivelExperiencia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

    private String nome;
    private NivelExperiencia nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();

    public Funcionario() {
    }

    public void adicionarContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato){
        contratos.remove(contrato);
    }

    public Double renda(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (Contrato contrato: contratos) {
            cal.setTime(contrato.getData());
            int anoContrato = cal.get(Calendar.YEAR);
            int mesContrato = 1 + cal.get(Calendar.MONTH);
            if (ano == anoContrato && mes == mesContrato){
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }

    public Funcionario(String nome, NivelExperiencia nivel, Double salarioBase, Departamento departamento, List<Contrato> contratos) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.contratos = contratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelExperiencia getNivel() {
        return nivel;
    }

    public void setNivel(NivelExperiencia nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    private void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nNivel de Experiencia: " + nivel + "\nSalario Base: " + salarioBase + "\nDepartamento: " + departamento.getNome() + "\nQuantidade de Contratos: " + contratos.size();
    }
}
