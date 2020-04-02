package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "fornecedorformapagamento")
public class FornecedorFormaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor_forma_pagamento")
    private Long id;
    @Column(name = "id_dados_bc")
    private String idDadosBc;
    private String fornecedor;
    @Column(name = "data_criacao")
    private String dataCriacao;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdDadosBc() {
        return idDadosBc;
    }

    public void setIdDadosBc(String idDadosBc) {
        this.idDadosBc = idDadosBc;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
