package S13.exercicios.pedidos.entity;

import S13.exercicios.pedidos.enums.OrdemStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private LocalDate momento;
    private OrdemStatus status;
    private Loja loja;
    private Cliente cliente;
    private List<PedidoItem> itens = new ArrayList<>();

    DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pedido() {
    }

    public Pedido(LocalDate momento, OrdemStatus status, Cliente cliente, Loja loja) {
        this.momento = momento;
        this.status = status;
        this.loja = loja;
        this.cliente = cliente;
    }

    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public DateTimeFormatter getFdt() {
        return fdt;
    }

    public void setFdt(DateTimeFormatter fdt) {
        this.fdt = fdt;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    public void adicionarItem(PedidoItem item){
        itens.add(item);
    }

    public void removerItem(PedidoItem item){
        itens.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for (PedidoItem item: itens){
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "-- Geração da Nota: " + momento.format(fdt) +
                "\n-- Loja: " + loja.getNome() +
                "\n-- Cnpj: " + loja.getCnpj() +
                "\n-- Status: " + status +
                "\n-- Total da Nota: " + total() +
                "\n-- Cliente: " + cliente.getNome();
    }
}
