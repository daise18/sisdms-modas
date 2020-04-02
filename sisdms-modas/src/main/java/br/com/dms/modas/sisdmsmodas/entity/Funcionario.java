package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long id;
    private String cargo;
    private String departamento;
    @Column(name = "id_contrato")
    private String idContrato;
    private String email;
    @Column(name = "id_pessoa")
    private String idPessoa;
    @Column(name = "id_dados_bc")
    private String idDadosBc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getIdDadosBc() {
        return idDadosBc;
    }

    public void setIdDadosBc(String idDadosBc) {
        this.idDadosBc = idDadosBc;
    }
}
