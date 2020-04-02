package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="nota_fiscal")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nota_fiscal")
    private Long id;
    @Column(name = "tipo_nf")
    private String tipoNF;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name ="id_fornecedor")
    private String idFornecedor;
    @Column(name = "id_pedido")
    private String idPedido;
    @Column(name = "id_carrinho")
    private String idCarrinho;
    @Column(name = "data_criacao")
    private String dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(String idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
