package model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numeroPedido;
    private Timestamp data;
    private int quantidade;
    private float valorPedido;
    private float precoUnitario;
    private String itensPedido;
    private String cpfCliente;
    private int idSorvete;
    private String statusPedido;

    public Pedido() {}

    public Pedido(int id, int numeroPedido, Timestamp data, int quantidade, float valorPedido, float precoUnitario, String itensPedido, String cpfCliente, int idSorvete, String statusPedido) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.quantidade = quantidade;
        this.valorPedido = valorPedido;
        this.precoUnitario = precoUnitario;
        this.itensPedido = itensPedido;
        this.cpfCliente = cpfCliente;
        this.idSorvete = idSorvete;
        this.statusPedido = statusPedido;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(String itensPedido) {
        this.itensPedido = itensPedido;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getIdSorvete() {
        return idSorvete;
    }

    public void setIdSorvete(int idSorvete) {
        this.idSorvete = idSorvete;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
}
