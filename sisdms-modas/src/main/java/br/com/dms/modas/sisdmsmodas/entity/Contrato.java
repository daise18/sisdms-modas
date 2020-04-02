package br.com.dms.modas.sisdmsmodas.entity;


import javax.persistence.*;

@Entity(name="contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Long id;
    private String tipo;
    @Column(name = "data_criacao")
    private String dataCriaco;
    @Column(name = "data_atualizacao")
    private String dataAtualizacao;
    private String situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataCriaco() {
        return dataCriaco;
    }

    public void setDataCriaco(String dataCriaco) {
        this.dataCriaco = dataCriaco;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
