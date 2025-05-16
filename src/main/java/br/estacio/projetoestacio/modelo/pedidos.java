/*
 * Classe de modelo que representa a entidade "pedidos" no banco de dados.
 * Utiliza anotações JPA para mapear os campos da classe para as colunas da tabela.
 * Fornece construtores, getters, setters e método toString para manipulação dos dados.
 */
package br.estacio.projetoestacio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe de entidade para pedidos.
 * 
 * @author Kayke Ragoso
 */
@Entity
@Table(name="pedidos")
public class pedidos {
    // Identificador único do pedido (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    // Endereço do pedido (não pode ser nulo)
    @Column(nullable = false)
    private String endereco;

    // Ponto de referência do pedido (não pode ser nulo)
    @Column(nullable = false)
    private String pontoReferencia;

    // Setor de serviço do pedido (não pode ser nulo)
    @Column(nullable = false)
    private String setorServico;

    // Nome do cliente (não pode ser nulo)
    @Column(nullable = false)
    private String cliente;

    // Tempo de filmagem (não pode ser nulo)
    @Column(nullable = false)
    private String tempoFilmagem;

    // Número de celular do cliente (não pode ser nulo)
    @Column(nullable = false)
    private String numeroCelularCliente;

    // Dia da filmagem (não pode ser nulo)
    @Column(nullable = false)
    private String diaFilmagem;

    // Horário da filmagem (não pode ser nulo)
    @Column(nullable = false)
    private String horarioFilmagem;

    // Tipo de filmagem (não pode ser nulo)
    @Column(nullable = false)
    private String tipoFilmagem;

    // Preço estimado do pedido (não pode ser nulo)
    @Column(nullable = false)
    private String preçoEstimado;

    // Construtor padrão
    public pedidos() {
    }

    // Construtor com parâmetros
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

    // Getters e setters para todos os campos
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

    // Representação em String do objeto pedidos
    @Override
    public String toString() {
        return "pedidos{" + "codigo=" + codigo + ", endereco=" + endereco + ", pontoReferencia=" + pontoReferencia + ", setorServico=" + setorServico + ", cliente=" + cliente + ", tempoFilmagem=" + tempoFilmagem + ", numeroCelularCliente=" + numeroCelularCliente + ", diaFilmagem=" + diaFilmagem + ", horarioFilmagem=" + horarioFilmagem + ", tipoFilmagem=" + tipoFilmagem + ", preçoEstimado=" + preçoEstimado + '}';
    }
}
