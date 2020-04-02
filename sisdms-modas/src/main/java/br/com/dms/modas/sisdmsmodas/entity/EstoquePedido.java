package br.com.dms.modas.sisdmsmodas.entity;


import javax.persistence.*;

@Entity(name = "estoque_pedido")
public class EstoquePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estoque_pedido")
    private Long id;
    @Column(name = "id_pedido")
    private String idPedido;
    @Column(name = "id_estoque")
    private String idEstoque;
    @Column(name = "data_cadastro")
    private String dataCadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(String idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
