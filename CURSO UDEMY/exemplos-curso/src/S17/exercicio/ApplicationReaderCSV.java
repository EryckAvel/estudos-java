package S17.exercicio;

import S17.exercicio.model.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationReaderCSV {

    private static final String PATHIN = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\exemplos-curso\\src\\S17\\exercicio\\in\\produto.csv";
    private static final String PATHOUT = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\exemplos-curso\\src\\S17\\exercicio\\out\\produto.csv";

    public static void main(String[] args) {
        System.out.println("----- REALIZANDO LEITURA DE CSV -----");
        File file = new File(PATHIN);
        List<Produto> produtos = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATHIN));
            String line = br.readLine();
            while (line != null){
                String produto[] = line.split(",");
                produtos.add(new Produto(produto[0], Double.parseDouble(produto[1]), Integer.parseInt(produto[2])));
                line = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATHOUT, false));
            for (Produto p:produtos){
                System.out.println(p.toString());
                bw.write(p.toString());
                bw.newLine();
            }
            bw.close();
        }catch (IOException i){
            System.out.println("Error: " + i.getMessage());
            i.printStackTrace();
        }
    }

}
