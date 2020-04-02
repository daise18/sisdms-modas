package br.com.dms.modas.sisdmsmodas.entity;


import javax.persistence.*;

@Entity(name = "carrinho_cliente")
public class CarrinhoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrinho_cliente")
    private Long id;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "data_criacao")
    private String dataCriacao;
    @Column(name = "valor_total")
    private String valorTotal;
    @Column(name = "id_estabelecimento")
    private String idEstabelecimento;
    @Column(name = "id_forma_pg")
    private String idFormaPG;
    private String situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    public String getIdFormaPG() {
        return idFormaPG;
    }

    public void setIdFormaPG(String idFormaPG) {
        this.idFormaPG = idFormaPG;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
