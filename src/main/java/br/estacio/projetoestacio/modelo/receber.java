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
@Table(name="receber")
public class receber {
     //Wrappers --> Integer, Double, Float, Boolean, ...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(nullable = false)
    private String valorRecebimento;
    @Column(nullable = false)
    private String nomecompletoCliente;
    @Column(nullable = false)
    private String servicoRealizado;

    public receber() {
    }

    public receber(Integer codigo, String valorRecebimento, String nomecompletoCliente, String servicoRealizado) {
        this.codigo = codigo;
        this.valorRecebimento = valorRecebimento;
        this.nomecompletoCliente = nomecompletoCliente;
        this.servicoRealizado = servicoRealizado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(String valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
    }

    public String getNomecompletoCliente() {
        return nomecompletoCliente;
    }

    public void setNomecompletoCliente(String nomecompletoCliente) {
        this.nomecompletoCliente = nomecompletoCliente;
    }

    public String getServicoRealizado() {
        return servicoRealizado;
    }

    public void setServicoRealizado(String servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }

    @Override
    public String toString() {
        return "receber{" + "codigo=" + codigo + ", valorRecebimento=" + valorRecebimento + ", nomecompletoCliente=" + nomecompletoCliente + ", servicoRealizado=" + servicoRealizado + '}';
    }

  
}
