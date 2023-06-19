package S13.exercicios.pedidos.application;

import S13.exercicios.pedidos.entity.*;
import S13.exercicios.pedidos.enums.OrdemStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProgramPedido {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int qtd = 0;
        int p = 0, i = 0;
        Cliente cliente;
        List<Pedido> pedidos = new ArrayList<>();
        PedidoItem item = new PedidoItem();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("----------- Serviço de Pedidos -----------\n");
        System.out.print("Digite o nome da loja: ");
        String nomeLoja = entrada.nextLine();
        System.out.print("Digite o Cnpj da loja: ");
        String cnpj = entrada.nextLine();
        var loja = new Loja(nomeLoja, cnpj);
        System.out.println("\n----------- Cadastro de Cliente -----------\n");
        System.out.print("Digite seu Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu Email: ");
        String email = entrada.nextLine();
        System.out.print("Digite seu Aniversario: ");
        LocalDate dataAniver = LocalDate.from(formatterDate.parse(entrada.nextLine()));
        cliente = new Cliente(nome, email, dataAniver);
        System.out.print("Deseja realizar um pedido (S/N): ");
        String resposta = entrada.nextLine();
        while (resposta.equals("S")){
            System.out.println("\n----------- Cadastro de Pedido -----------\n");
            System.out.print("Digite o Status dos Pedidos: ");
            OrdemStatus status = OrdemStatus.valueOf(entrada.nextLine());
            System.out.print("Digite a quantidade de itens do Pedido: ");
            Integer lim = Integer.parseInt(entrada.nextLine());
            System.out.println();
            pedidos.add(new Pedido(LocalDate.now(), status, cliente , loja));
            for (i = 0; i < lim ; i++){
                System.out.println("----------- Item #" + (i+1) + " -----------");
                System.out.print("Digite a quantiade: ");
                Integer quantidade = Integer.parseInt(entrada.nextLine());
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = entrada.nextLine();
                System.out.print("Digite o preço do produto: ");
                Double precoProduto = Double.parseDouble(entrada.nextLine());
                var pedidoItem = new PedidoItem(quantidade, new Produto(nomeProduto, precoProduto));
                pedidoItem.subTotal();
                pedidos.get(qtd).adicionarItem(pedidoItem);
            }
            System.out.println("\n------------------------------------------\n");
            qtd += 1;
            System.out.print("Deseja fazer outro pedido (S/N): ");
            resposta = entrada.nextLine();
        }
        System.out.println("\n----------- Nota Fiscal -----------");
        for (Pedido pedido: pedidos) {
            int it = 0;
            p++ ;
            System.out.println("\n----------- Pedido #" + p +" - Cod : " + new Random().nextInt(10000) + " -----------\n");
            System.out.println(pedido.toString());
            for (PedidoItem iten:pedido.getItens()){
                it++;
                System.out.println("\n----------- Item #" + (it) +" -----------");
                System.out.println(iten.toString());
            }
        }
    }

}
;