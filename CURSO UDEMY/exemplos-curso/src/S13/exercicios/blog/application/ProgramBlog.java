package S13.exercicios.blog.application;

import S13.exercicios.blog.entity.Comentario;
import S13.exercicios.blog.entity.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramBlog {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        int qtd = 0;
        List<Postagem> posts = new ArrayList<>();
        LocalDateTime data = LocalDateTime.now();
        Comentario comentario = new Comentario();

        System.out.println("------ BLOG ------");
        System.out.print("Deseja realizar uma postagem (S/N): ");
        String resposta = entrada.nextLine();
        System.out.println();
        if (resposta.equals("N")){
            System.out.println("Obrigado por visitar nosso Blog!");
        }else {
            while (resposta.equals("S")) {
                System.out.println("-------- POST --------");
                System.out.print("Digite o Titulo do Blog: ");
                String titulo = entrada.nextLine();
                System.out.print("Digite o Conteudo do Blog: ");
                String conteudoB = entrada.nextLine();
                posts.add(new Postagem(data, titulo, conteudoB, new Random().nextInt(100)));
                System.out.print("Deseja relalizar um comentario nesse post (S/N): ");
                String respostaC = entrada.nextLine();
                System.out.println("---- COMENTARIOS ----");
                while (respostaC.equals("S")) {
                    System.out.print("Digite seu Nick de Usuario: ");
                    String usuario = entrada.nextLine();
                    System.out.print("Comentario: ");
                    String conteudoC = entrada.nextLine();
                    comentario = new Comentario(usuario, conteudoC);
                    posts.get(qtd).adicionarComentario(comentario);
                    System.out.print("Deseja relalizar outro comentario nesse post (S/N): ");
                    respostaC = entrada.nextLine();
                }
                qtd =+ 1;
                System.out.print("Deseja realizar uma postagem (S/N): ");
                resposta = entrada.nextLine();
            }
            System.out.println("\n");
            System.out.println("------ BLOGS ------");
            for (Postagem post : posts) {
                System.out.println(post.toString());
                System.out.println("Comentarios: ");
                for (Comentario comentarioF : post.getComentarios()) {
                    System.out.println(comentarioF);
                }
            }
        }

    }

}
