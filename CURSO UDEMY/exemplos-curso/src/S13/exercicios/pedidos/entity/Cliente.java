package S13.exercicios.pedidos.entity;

import java.time.LocalDate;
import java.util.List;

public class Cliente {

    private String nome;
    private String email;
    private LocalDate data_aniversario;

    public Cliente() {
    }

    public Cliente(String nome, String email, LocalDate data_aniversario) {
        this.nome = nome;
        this.email = email;
        this.data_aniversario = data_aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_aniversario() {
        return data_aniversario;
    }

    public void setData_aniversario(LocalDate data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

}


