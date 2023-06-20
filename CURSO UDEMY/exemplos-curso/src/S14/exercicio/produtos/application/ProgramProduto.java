package S14.exercicio.produtos.application;

import S14.exercicio.produtos.entity.Produto;
import S14.exercicio.produtos.entity.ProdutoImportado;
import S14.exercicio.produtos.entity.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramProduto {

    static Scanner entrada = new Scanner(System.in);
    static DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        System.out.println("--------------- Cadastro de Produtos ---------------\n");
        System.out.print("Insira a quantidade de cadastro de produtos: ");
        Integer lim = Integer.parseInt(entrada.nextLine());
        for(int i = 0; i < lim; i++){
            System.out.println("\n-----------------------------------------------\n");
            System.out.println("Digite os dados do #" + (i+1) + " produto: ");
            System.out.print("Comum, usado ou importado (C/U/I): ");
            String resposta = entrada.nextLine();
            System.out.print("Nome do Produto: ");
            String nome = entrada.nextLine();
            System.out.print("Preço: ");
            Double preco = Double.parseDouble(entrada.nextLine());
            if (resposta.equals("U")){
                System.out.print("Data de Fabricação (DD/MM/YYYY): ");
                LocalDate datafab = LocalDate.from(formatterDate.parse(entrada.nextLine()));
                produtos.add(new ProdutoUsado(nome,preco,datafab));
            } else if (resposta.equals("I")) {
                System.out.print("Digite o Valor da Taxa: ");
                Double taxaAlfa = Double.parseDouble(entrada.nextLine());
                produtos.add(new ProdutoImportado(nome, preco, taxaAlfa));
            }else{
                produtos.add(new Produto(nome, preco));
            }
        }
        System.out.println("\n--------------- Relação de Produtos ---------------");
        int i = 0;
        for (Produto produto: produtos){
            System.out.println("--------------- Produto #" + (i+1) + " ---------------");
            i++;
            System.out.println(produto.toString());
        }
    }

}
