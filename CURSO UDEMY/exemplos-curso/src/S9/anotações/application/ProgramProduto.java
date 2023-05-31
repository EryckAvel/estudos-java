package S9.anotações.application;

import S9.anotações.entity.Produto;

import java.util.Scanner;

public class ProgramProduto {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int qtd;
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome:");
        String nome = entrada.nextLine();
        System.out.print("Preço:");
        double preco = Double.parseDouble(entrada.nextLine());
        System.out.print("Quantidade no Estoque:");
        int quantidade = Integer.parseInt(entrada.nextLine());
        Produto p = new Produto(nome, preco, quantidade);
        System.out.println(p.toString());
        System.out.print("Digite a quantidade que deseja adicionar no estoque:");
        qtd = Integer.parseInt(entrada.nextLine());
        p.adicionarProdutos(qtd);
        System.out.println(p.toString());
        p.setNome("TESTE DE ALTERAÇÃO MUDANDO O NOME NO SETER");
        System.out.println("Nome mostrando nome alterado usando o GET:" + p.getNome());
        System.out.print("Digite a quantidade que deseja retirar do estoque:");
        qtd = Integer.parseInt(entrada.nextLine());
        p.removerProdutos(qtd);
        System.out.println(p.toString());
    }
}
