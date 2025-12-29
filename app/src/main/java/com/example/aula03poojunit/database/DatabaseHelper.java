package com.example.aula03poojunit.database;

public class DatabaseHelper {
    private static final String DATABASE_NAME = "aula03DB.db";
    private static final int DATABASE_VERSION = 1;

    // Tabela Endereço
    public static final String TABLE_ENDERECO = "endereco";
    public static final String COLUMN_ENDERECO_ID = "id";
    public static final String COLUMN_ENDERECO_ENDERECO = "endereco";
    public static final String COLUMN_ENDERECO_CIDADE = "cidade";
    public static final String COLUMN_ENDERECO_ESTADO = "estado";

    // Tabela Fornecedor
    public static final String TABLE_FORNECEDOR = "fornecedor";
    public static final String COLUMN_FORNECEDOR_ID = "id";
    public static final String COLUMN_FORNECEDOR_NOME = "nome";
    public static final String COLUMN_FORNECEDOR_CONTATO = "contato";
    public static final String COLUMN_FORNECEDOR_ENDERECO_ID = "endereco_id";
    public static final String COLUMN_FORNECEDOR_PRODUTOS = "produtos";


    // Tabela Produto
    public static final String TABLE_PRODUTO = "produto";
    public static final String COLUMN_PRODUTO_ID = "id";
    public static final String COLUMN_PRODUTO_DESCRICAO = "descricao";
    public static final String COLUMN_PRODUTO_UNIDADE = "unidade";
    public static final String COLUMN_PRODUTO_QUANTIDADE = "quantidade";
    public static final String COLUMN_PRODUTO_VALOR = "valor";
    public static final String COLUMN_PRODUTO_ESTOQUE = "estoque";
    public static final String COLUMN_PRODUTO_FORNECEDOR_ID = "fornecedor_id";

// Tabela de relacionamento entre Fornecedor e Produto
    public static final String TABLE_FORNECEDOR_PRODUTO = "fornecedor_produto";
    public static final String COLUMN_FORNECEDOR_PRODUTO_FORNECEDOR_ID = "fornecedor_id";
    public static final String COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID = "produto_id";

// criacao de tabelas estrutura do banco de dados
public static final String CREATE_TABLE_ENDERECO = "CREATE TABLE " + TABLE_ENDERECO + "("
        + COLUMN_ENDERECO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + COLUMN_ENDERECO_ENDERECO + " TEXT,"
        + COLUMN_ENDERECO_CIDADE + " TEXT,"
        + COLUMN_ENDERECO_ESTADO + " TEXT"
        + ")";

public static final String CREATE_TABLE_FORNECEDOR = "CREATE TABLE " + TABLE_FORNECEDOR + "("
        + COLUMN_FORNECEDOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + COLUMN_FORNECEDOR_NOME + " TEXT,"
        + COLUMN_FORNECEDOR_CONTATO + " TEXT,"
        + COLUMN_FORNECEDOR_ENDERECO_ID + " INTEGER,"
        + "FOREIGN KEY(" + COLUMN_FORNECEDOR_ENDERECO_ID + ") REFERENCES " + TABLE_ENDERECO + "(" + COLUMN_ENDERECO_ID + ")"
        + ")";

public static final String CREATE_TABLE_PRODUTO = "CREATE TABLE " + TABLE_PRODUTO + "("
        + COLUMN_PRODUTO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + COLUMN_PRODUTO_DESCRICAO + " TEXT,"
        + COLUMN_PRODUTO_UNIDADE + " TEXT,"
        + COLUMN_PRODUTO_QUANTIDADE + " REAL,"
        + COLUMN_PRODUTO_VALOR + " REAL,"
        + COLUMN_PRODUTO_ESTOQUE + " INTEGER,"
        + COLUMN_PRODUTO_FORNECEDOR_ID + " INTEGER,"
        + "FOREIGN KEY(" + COLUMN_PRODUTO_FORNECEDOR_ID + ") REFERENCES " + TABLE_FORNECEDOR + "(" + COLUMN_FORNECEDOR_ID + ")"
        + ")";

public static final String CREATE_TABLE_FORNECEDOR_PRODUTO = "CREATE TABLE " + TABLE_FORNECEDOR_PRODUTO + "("
        + COLUMN_FORNECEDOR_PRODUTO_FORNECEDOR_ID + " INTEGER,"
        + COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID + " INTEGER,"
        + "PRIMARY KEY(" + COLUMN_FORNECEDOR_PRODUTO_FORNECEDOR_ID + "," + COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID + "),"
        + "FOREIGN KEY(" + COLUMN_FORNECEDOR_PRODUTO_FORNECEDOR_ID + ") REFERENCES " + TABLE_FORNECEDOR + "(" + COLUMN_FORNECEDOR_ID + "),"
        + "FOREIGN KEY(" + COLUMN_FORNECEDOR_PRODUTO_PRODUTO_ID + ") REFERENCES " + TABLE_PRODUTO + "(" + COLUMN_PRODUTO_ID + ")"
        + ")";









}
