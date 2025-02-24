/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 16380127763
 */
@Entity
@Table(name="pedidos")
public class pedidos {
        //Wrappers --> Integer, Double, Float, Boolean, ...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String pontoReferencia;
    @Column(nullable = false)
    private String setorServico;
    @Column(nullable = false)
    private String cliente;
    @Column(nullable = false)
    private String tempoFilmagem;
    @Column(nullable = false)
    private String numeroCelularCliente;
    @Column(nullable = false)
    private String diaFilmagem;
    @Column(nullable = false)
    private String horarioFilmagem;
    @Column(nullable = false)
    private String tipoFilmagem;
    @Column(nullable = false)
    private String preçoEstimado;

    public pedidos() {
    }

    public pedidos(Integer codigo, String endereco, String pontoReferencia, String setorServico, String cliente, String tempoFilmagem, String numeroCelularCliente, String diaFilmagem, String horarioFilmagem, String tipoFilmagem, String preçoEstimado) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.pontoReferencia = pontoReferencia;
        this.setorServico = setorServico;
        this.cliente = cliente;
        this.tempoFilmagem = tempoFilmagem;
        this.numeroCelularCliente = numeroCelularCliente;
        this.diaFilmagem = diaFilmagem;
        this.horarioFilmagem = horarioFilmagem;
        this.tipoFilmagem = tipoFilmagem;
        this.preçoEstimado = preçoEstimado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getSetorServico() {
        return setorServico;
    }

    public void setSetorServico(String setorServico) {
        this.setorServico = setorServico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTempoFilmagem() {
        return tempoFilmagem;
    }

    public void setTempoFilmagem(String tempoFilmagem) {
        this.tempoFilmagem = tempoFilmagem;
    }

    public String getNumeroCelularCliente() {
        return numeroCelularCliente;
    }

    public void setNumeroCelularCliente(String numeroCelularCliente) {
        this.numeroCelularCliente = numeroCelularCliente;
    }

    public String getDiaFilmagem() {
        return diaFilmagem;
    }

    public void setDiaFilmagem(String diaFilmagem) {
        this.diaFilmagem = diaFilmagem;
    }

    public String getHorarioFilmagem() {
        return horarioFilmagem;
    }

    public void setHorarioFilmagem(String horarioFilmagem) {
        this.horarioFilmagem = horarioFilmagem;
    }

    public String getTipoFilmagem() {
        return tipoFilmagem;
    }

    public void setTipoFilmagem(String tipoFilmagem) {
        this.tipoFilmagem = tipoFilmagem;
    }

    public String getPreçoEstimado() {
        return preçoEstimado;
    }

    public void setPreçoEstimado(String preçoEstimado) {
        this.preçoEstimado = preçoEstimado;
    }

    @Override
    public String toString() {
        return "pedidos{" + "codigo=" + codigo + ", endereco=" + endereco + ", pontoReferencia=" + pontoReferencia + ", setorServico=" + setorServico + ", cliente=" + cliente + ", tempoFilmagem=" + tempoFilmagem + ", numeroCelularCliente=" + numeroCelularCliente + ", diaFilmagem=" + diaFilmagem + ", horarioFilmagem=" + horarioFilmagem + ", tipoFilmagem=" + tipoFilmagem + ", pre\u00e7oEstimado=" + preçoEstimado + '}';
    }

   
    
    
}
