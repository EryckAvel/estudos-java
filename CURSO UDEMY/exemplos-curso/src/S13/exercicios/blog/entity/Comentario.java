package S13.exercicios.blog.entity;

public class Comentario {

    private String usuario;
    private String conteudo;

    public Comentario() {
    }

    public Comentario(String usuario, String conteudo) {
        this.usuario = usuario;
        this.conteudo = conteudo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "\n  Usuario: " + usuario + "\n  Comentario: " + conteudo + "\n";
    }
}
