package S18.anotacao.motivador.app;

import S18.anotacao.motivador.model.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramMotivador2 {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        String path = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\patricascurso\\src\\S18\\anotacao\\motivador\\nomes.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String funcionariocsv = br.readLine();
            while(funcionariocsv != null){
                String[] fields = funcionariocsv.split(",");
                funcionarios.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionariocsv = br.readLine();
            }
            Collections.sort(funcionarios);
            for (Funcionario funcionario : funcionarios){
                System.out.println("Nome Funcionario : " + funcionario.getNome() + ", Salario : " + funcionario.getSalario());
            }
        }catch (IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }

}
