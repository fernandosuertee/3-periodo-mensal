package model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ClienteVisitante {
    private String nome;
    @Id
    private String cpf;

    public ClienteVisitante() {}

    public ClienteVisitante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
