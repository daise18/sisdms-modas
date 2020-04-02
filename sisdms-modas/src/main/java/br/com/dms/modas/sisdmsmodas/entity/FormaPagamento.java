package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "forma_pg")
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pg")
    private Long id;

    @Column(name = "tipo_pg")
    private String tipoPG;

    @Column(name = "id_dados_bancarios")
    private String idDadosBancarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPG() {
        return tipoPG;
    }

    public void setTipoPG(String tipoPG) {
        this.tipoPG = tipoPG;
    }

    public String getIdDadosBancarios() {
        return idDadosBancarios;
    }

    public void setIdDadosBancarios(String idDadosBancarios) {
        this.idDadosBancarios = idDadosBancarios;
    }
}
