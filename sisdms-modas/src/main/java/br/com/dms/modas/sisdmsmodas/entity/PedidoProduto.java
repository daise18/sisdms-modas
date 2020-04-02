package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="pedido_produto")
public class PedidoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_produto")
    private Long id;
    @Column(name = "id_catalogo_prod_fornecedor")
    private String idCatalogoProdFornecedor;
    private String quantidade;
    @Column(name = "valor_unitario")
    private String valorUnitario;
    @Column(name = "valor_total")
    private String valorTotal;
    @Column(name = "id_pedido_fornecedor")
    private String idPedidoFornecedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCatalogoProdFornecedor() {
        return idCatalogoProdFornecedor;
    }

    public void setIdCatalogoProdFornecedor(String idCatalogoProdFornecedor) {
        this.idCatalogoProdFornecedor = idCatalogoProdFornecedor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getIdPedidoFornecedor() {
        return idPedidoFornecedor;
    }

    public void setIdPedidoFornecedor(String idPedidoFornecedor) {
        this.idPedidoFornecedor = idPedidoFornecedor;
    }
}
