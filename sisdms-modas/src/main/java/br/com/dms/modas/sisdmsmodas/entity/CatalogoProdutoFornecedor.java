package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "catalogo_produto_fornecedor")
public class CatalogoProdutoFornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo_produto_fornecedor")
    private Long id;
    @Column(name = "id_produto")
    private String idProduto;
    @Column(name = "qtd_disponivel")
    private String qtdDisponivel;
    @Column(name = "id_fornecedor")
    private String idFornecedor;
    @Column(name = "valor_unitario")
    private String valorUnitario;
    @Column(name = "data_cadastro")
    private String dataCadastro;

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

    public String getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(String qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public String getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
