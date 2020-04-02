package br.com.dms.modas.sisdmsmodas.entity;

import javax.persistence.*;

@Entity(name="ponto_funcionario")
public class PontoFuncionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ponto_funcionario")
    private Long id;
    @Column(name = "id_funcionario")
    private String idFuncionario;
    @Column(name = "ponto_entrada")
    private String pontoEntrada;
    @Column(name = "ponto_saida")
    private String pontoSaida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getPontoEntrada() {
        return pontoEntrada;
    }

    public void setPontoEntrada(String pontoEntrada) {
        this.pontoEntrada = pontoEntrada;
    }

    public String getPontoSaida() {
        return pontoSaida;
    }

    public void setPontoSaida(String pontoSaida) {
        this.pontoSaida = pontoSaida;
    }
}
