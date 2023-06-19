package S13.exercicios.blog.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private List<Comentario> comentarios = new ArrayList<>();
    DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Postagem() {
    }

    public Postagem(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nConteudo: " + conteudo + "\nLikes: " + likes + "\nMomento de Publicação: " + momento.format(fdt) + "\n";
    }
}
