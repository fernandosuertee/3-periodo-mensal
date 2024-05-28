package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MaquinaSorvete {
    @Id
    private String modelo;
    private int capacidade;

    public MaquinaSorvete() {}

    public MaquinaSorvete(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}


