package S18.anotacao.motivador.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramMotivador {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        String path = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\patricascurso\\src\\S18\\anotacao\\motivador\\nomes.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linha = br.readLine();
            while(linha != null){
                nomes.add(linha);
                linha = br.readLine();
            }
            Collections.sort(nomes);
            for (String nome : nomes){
                System.out.println(nome);
            }
        }catch (IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }

}
