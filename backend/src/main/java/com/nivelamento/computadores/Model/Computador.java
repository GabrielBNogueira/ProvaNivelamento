package com.nivelamento.computadores.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String cor;
    private int dataFabricacao;


    protected Computador () {}

    public Computador(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(int dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

}
