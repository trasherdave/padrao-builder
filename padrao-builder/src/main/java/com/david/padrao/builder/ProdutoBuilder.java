/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.padrao.builder;

import java.time.LocalDate;


public class ProdutoBuilder {

    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String categoria;
    private Vendedor vendedor;

    public ProdutoBuilder() {
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto build() {
        return new Produto(titulo, descricao, marca, modelo, preco, dataCadastro, dataUltimaAtualizacao, categoria, vendedor);
    }
    
}
