package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "pedido_forncecedor")
public class PedidoForncecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_fornecedor")
    private Long id;
    @Column(name = "id_estoque_pedido")
    private String idEstoquePedido;
    private String telefone;
    private String email;
    @Column(name = "id_forma_pg")
    private String idFormaPg;
    @Column(name = "id_fornecedor")
    private String idFornecedor;
    @Column(name = "data_criacao")
    private String dataCriacao;
    private String status;
    @Column(name = "id_pedido")
    private String idPedido;
    @Column(name = "valor_toral")
    private String valorTotal;
    @Column(name = "id_estabelecimento")
    private String idEstabelecimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdEstoquePedido() {
        return idEstoquePedido;
    }

    public void setIdEstoquePedido(String idEstoquePedido) {
        this.idEstoquePedido = idEstoquePedido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFormaPg() {
        return idFormaPg;
    }

    public void setIdFormaPg(String idFormaPg) {
        this.idFormaPg = idFormaPg;
    }

    public String getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        this.idFornecedor = idFornecedor;
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

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(String idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }
}
