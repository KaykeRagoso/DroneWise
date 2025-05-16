/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe de entidade para valores a receber.
 * 
 * @author Kayke Ragoso
 */
package br.estacio.projetoestacio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe de modelo que representa a entidade "receber" no banco de dados.
 * Utiliza anotações JPA para mapear os campos da classe para as colunas da tabela.
 * Fornece construtores, getters, setters e método toString para manipulação dos dados.
 */
@Entity
@Table(name="receber")
public class receber {
    // Identificador único do recebimento (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    // Valor do recebimento (não pode ser nulo)
    @Column(nullable = false)
    private String valorRecebimento;

    // Nome completo do cliente (não pode ser nulo)
    @Column(nullable = false)
    private String nomecompletoCliente;

    // Serviço realizado (não pode ser nulo)
    @Column(nullable = false)
    private String servicoRealizado;

    // Construtor padrão
    public receber() {
    }

    // Construtor com parâmetros
    public receber(Integer codigo, String valorRecebimento, String nomecompletoCliente, String servicoRealizado) {
        this.codigo = codigo;
        this.valorRecebimento = valorRecebimento;
        this.nomecompletoCliente = nomecompletoCliente;
        this.servicoRealizado = servicoRealizado;
    }

    // Getters e setters para todos os campos
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

    // Representação em String do objeto receber
    @Override
    public String toString() {
        return "receber{" + "codigo=" + codigo + ", valorRecebimento=" + valorRecebimento + ", nomecompletoCliente=" + nomecompletoCliente + ", servicoRealizado=" + servicoRealizado + '}';
    }
}
