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
 * Classe de entidade para pagamento de funcionários.
 * 
 * @author Kayke Ragoso
 */
@Entity
@Table(name="pagamentofuncionario")
public class pagamentofuncionario {
    // Identificador único do pagamento (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    // Nome do funcionário (não pode ser nulo)
    @Column(nullable = false)
    private String nomeFuncionario;

    // CPF do funcionário (não pode ser nulo e deve ser único)
    @Column(nullable = false, unique = true)
    private String CPFuncionario;

    // Horas trabalhadas pelo funcionário (não pode ser nulo)
    @Column(nullable = false)
    private String horasTrabalhadas;

    // Quantidade de voos feitos no mês (não pode ser nulo)
    @Column(nullable = false)
    private String VoosfeitosMês;

    // Telefone do funcionário (não pode ser nulo e deve ser único)
    @Column(nullable = false, unique = true)
    private String TelefoneFuncionario;

    // Valor do pagamento (não pode ser nulo)
    @Column(nullable = false)
    private String pagamento;
    
    // Construtor padrão
    public pagamentofuncionario() {
    }    

    // Construtor com parâmetros
    public pagamentofuncionario(Integer codigo, String nomeFuncionario, String CPFuncionario, String horasTrabalhadas, String VoosfeitosMês, String TelefoneFuncionario, String pagamento) {
        this.codigo = codigo;
        this.nomeFuncionario = nomeFuncionario;
        this.CPFuncionario = CPFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.VoosfeitosMês = VoosfeitosMês;
        this.TelefoneFuncionario = TelefoneFuncionario;
        this.pagamento = pagamento;
    }

    // Getters e setters para todos os campos
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCPFuncionario() {
        return CPFuncionario;
    }

    public void setCPFuncionario(String CPFuncionario) {
        this.CPFuncionario = CPFuncionario;
    }

    public String getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(String horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getVoosfeitosMês() {
        return VoosfeitosMês;
    }

    public void setVoosfeitosMês(String VoosfeitosMês) {
        this.VoosfeitosMês = VoosfeitosMês;
    }

    public String getTelefoneFuncionario() {
        return TelefoneFuncionario;
    }

    public void setTelefoneFuncionario(String TelefoneFuncionario) {
        this.TelefoneFuncionario = TelefoneFuncionario;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    // Representação em String do objeto pagamentofuncionario
    @Override
    public String toString() {
        return "pagamentofuncionario{" + "codigo=" + codigo + ", nomeFuncionario=" + nomeFuncionario + ", CPFuncionario=" + CPFuncionario + ", horasTrabalhadas=" + horasTrabalhadas + ", VoosfeitosMês=" + VoosfeitosMês + ", TelefoneFuncionario=" + TelefoneFuncionario + ", pagamento=" + pagamento + '}';
    }
}
