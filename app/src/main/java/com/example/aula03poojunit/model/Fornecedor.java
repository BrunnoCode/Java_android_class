package com.example.aula03poojunit.model;

import java.util.List;

public class Fornecedor {
    private long id;
    private String nome;
    private String contato;
    private long enderecoID;
    private List<Produto> produtos;

   public Fornecedor(){}

    public Fornecedor(String nome, String contato, long enderecoID, List<Produto> produtos ){
        this.nome = nome;
        this.contato = contato;
        this.enderecoID = enderecoID;
        this.produtos = produtos;
    }

    public Fornecedor(long id, String nome, String contato, long enderecoID, List<Produto> produtos){
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.enderecoID = enderecoID;
        this.produtos = produtos;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public long getEnderecoID() {
        return enderecoID;
    }

    public void setEnderecoID(long enderecoID) {
        this.enderecoID = enderecoID;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", enderecoID=" + enderecoID +
                ", produtos=" + produtos +
                '}';
    }
}
