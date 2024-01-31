package S17.anotacao;

import java.io.*;
import java.util.Scanner;

public class TrabalhandoComArquivos {

    private static Scanner entrada;
    private static final String PATHIN = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\exemplos-curso\\src\\S17\\anotacao\\aquivos\\in.txt";
    private static final String PATHOUT = "C:\\Users\\eryck.avelino\\Desktop\\estudos-java\\CURSO UDEMY\\exemplos-curso\\src\\S17\\anotacao\\aquivos\\out.txt";
    public static void main(String[] args) {
        System.out.println("---- Trabalhando com Arquivos ---- \n");
        File file = new File(PATHIN);
        try{
            System.out.println("- Lendo Arquivos \n");
            entrada = new Scanner(file);
            while (entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }

            System.out.println("\n- Lendo Arquivos Usando File e Buffer Reader \n");

            FileReader fr = new FileReader(PATHIN);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

            System.out.println("\n- Escrevendo Arquivos Usando File e Buffer Reader \n");

            String[] lines = new String[] {"Ola, Mundo!", "Ola, Casa!", "Ola, Trabalho!"};

            BufferedWriter bw = new BufferedWriter(new FileWriter(PATHOUT, false));

            for (String linew : lines){
                bw.write(linew);
                bw.newLine();
            }

            br = new BufferedReader(new FileReader(PATHOUT));

            line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

            System.out.println("\n- Manipulando pastas com o File \n");

            entrada = new Scanner(System.in);

            System.out.print("Digite um caminho: ");
            String strpath = entrada.nextLine();

            File path = new File(strpath);

            System.out.println("\nListando Pastas: \n");

            File[] folders = path.listFiles(File::isDirectory);

            for (File folder: folders){
                System.out.println("Pasta : " + folder);
            }

            System.out.println("\nListando Arquivos: \n");

            File[] files = path.listFiles(File::isFile);

            for (File filel: files){
                System.out.println("Arquivos : " + filel);
            }

            System.out.println("\nCriando Pastas: \n");

            boolean success = new File(strpath+"\\subdir").mkdir();

            System.out.println("Diretorio com sucesso: " + success);

            System.out.println("\n- Obtendo Infos do caminho do arquivo \n");

            System.out.print("Digite um caminho: ");
            String strpath2 = entrada.nextLine();

            File path2 = new File(strpath2);

            System.out.println("Nome do arquivo: " + path2.getName());
            System.out.println("Nome do caminho: " + path2.getParent());
            System.out.println("Caminho total: " + path2.getPath());



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
