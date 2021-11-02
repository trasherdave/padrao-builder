/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.padrao.builder;

import java.time.LocalDate;

/**
 *
 * @author David
 */
public class Produto {

    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    public Produto(String titulo, String descricao, String marca, String modelo, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria, Vendedor vendedor) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.setCategoria(categoria);
        this.setVendedor(vendedor);

    }

    public long getId() {
        return id;
    }

    public final void setId(long id) {

        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public final void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public final void setEstoque(int estoque) {

        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public final void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }

        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public final void setDataCadastro(LocalDate dataCadastro) {
        if (dataCadastro.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data não pode ser menor que a atual.");
        }

        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public final void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if (dataUltimaAtualizacao.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data não pode ser menor que a atual.");
        }

        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public final void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public final void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public final void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getPeso() {
        return peso;
    }

    public final void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public final void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public final void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public final void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Produto " + "\n titulo: " + titulo + "\n descricao: " + descricao
                + "\n marca: " + marca + "\n modelo: " + modelo + "\n preco: "
                + preco + "\n dataCadastro: " + dataCadastro
                + "\n dataUltimaAtualizacao: " + dataUltimaAtualizacao
                + "\n categoria: " + categoria + "\n vendedor: " + vendedor.getNome();
    }

}
