package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="carrinho_produto")
public class CarrinhoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrinho_produto")
    private Long id;

    @Column(name = "id_carrinho_cliente")
    private String idCarrinhoCliente;
    @Column(name = "id_produto")
    private String idProduto;
    @Column(name = "data_inclusao")
    private String dataInclusao;
    @Column(name = "quantidade_produto")
    private String quantidadeProduto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCarrinhoCliente() {
        return idCarrinhoCliente;
    }

    public void setIdCarrinhoCliente(String idCarrinhoCliente) {
        this.idCarrinhoCliente = idCarrinhoCliente;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(String dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
