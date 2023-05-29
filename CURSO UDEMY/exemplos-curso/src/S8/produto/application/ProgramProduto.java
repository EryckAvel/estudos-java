package S8.produto.application;

import S8.produto.entity.Produto;

import java.util.Scanner;

public class ProgramProduto {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int qtd;
        Produto p = new Produto();
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome:");
        p.nome = entrada.nextLine();
        System.out.print("Preço:");
        p.preco = Double.parseDouble(entrada.nextLine());
        System.out.print("Quantidade no Estoque:");
        p.quantidade = Integer.parseInt(entrada.nextLine());
        System.out.println(p.toString());
        System.out.print("Digite a quantidade que deseja adicionar no estoque:");
        qtd = Integer.parseInt(entrada.nextLine());
        p.adicionarProdutos(qtd);
        System.out.println(p.toString());
        System.out.print("Digite a quantidade que deseja retirar do estoque:");
        qtd = Integer.parseInt(entrada.nextLine());
        p.removerProdutos(qtd);
        System.out.println(p.toString());
    }

}
