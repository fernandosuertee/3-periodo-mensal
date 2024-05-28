package model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sorvete {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String sabor;
    private String tipo;
    private float preco;

    public Sorvete() {}

    public Sorvete(int id, String sabor, String tipo, float preco) {
        this.id = id;
        this.sabor = sabor;
        this.tipo = tipo;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
