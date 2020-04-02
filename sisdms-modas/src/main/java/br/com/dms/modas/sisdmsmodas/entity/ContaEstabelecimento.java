package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name = "conta_estabelecimento")
public class ContaEstabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta_estabelecimento")
    private Long id;
    private String tipo;
    @Column(name = "mes_referencia")
    private String mesReferencia;
    @Column(name = "mes_cobranca")
    private String mesCobranca;
    @Column(name = "data_vencimento")
    private String dataVencimento;
    @Column(name = "id_estabelecimento")
    private String idEstabelecimento;
    private String situacao;
    private String beneficiario;
    @Column(name = "codigo_de_barras")
    private String codigoDeBarras;
    @Column(name = "id_dados_bc_beneficiario")
    private String idDadosBCBeneficiario;

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

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public String getMesCobranca() {
        return mesCobranca;
    }

    public void setMesCobranca(String mesCobranca) {
        this.mesCobranca = mesCobranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(String idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getIdDadosBCBeneficiario() {
        return idDadosBCBeneficiario;
    }

    public void setIdDadosBCBeneficiario(String idDadosBCBeneficiario) {
        this.idDadosBCBeneficiario = idDadosBCBeneficiario;
    }
}
