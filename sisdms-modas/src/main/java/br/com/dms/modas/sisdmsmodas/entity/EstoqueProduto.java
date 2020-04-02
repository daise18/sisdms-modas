package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="estoque_produto")
public class EstoqueProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estoque_produto")
    private Long id;
    @Column(name = "id_produto")
    private String idProduto;
    @Column(name = "id_estoque")
    private String idEstoque;

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

    public String getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(String idEstoque) {
        this.idEstoque = idEstoque;
    }
}
