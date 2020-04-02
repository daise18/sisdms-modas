package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estoque")
    private Long id;
    @Column(name = "id_produto")
    private String idProduto;
    private String quantidade;
    @Column(name = "quantidade_total")
    private String quantidadeTotal;
    @Column(name = "quantidade_departamento")
    private String quantidadeDepartamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(String quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public String getQuantidadeDepartamento() {
        return quantidadeDepartamento;
    }

    public void setQuantidadeDepartamento(String quantidadeDepartamento) {
        this.quantidadeDepartamento = quantidadeDepartamento;
    }
}


