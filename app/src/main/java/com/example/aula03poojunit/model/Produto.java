package com.example.aula03poojunit.model;

public class Produto {
    private long id;
    private String descricao;
    private String unidade;
    private double quantidade;
    private double valor;
    private boolean estoque;
    private long fornecedorID;

    public Produto(){}

    public Produto(String descricao, String unidade, double quantidade, double valor, boolean estoque, long fornecedorID) {
        this.descricao = descricao;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valor = valor;
        this.estoque = estoque;
        this.fornecedorID = fornecedorID;

    }

    public Produto (long id, String descricao, String unidade, double quantidade, double valor, boolean estoque, long fornecedorID){
        this.id = id;
        this.descricao = descricao;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valor = valor;
        this.estoque = estoque;
        this.fornecedorID = fornecedorID;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }

    public long getFornecedorID() {
        return fornecedorID;
    }

    public void setFornecedorID(long fornecedorID) {
        this.fornecedorID = fornecedorID;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", unidade='" + unidade + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", estoque=" + estoque +
                ", fornecedorID=" + fornecedorID +
                '}';
    }
}
