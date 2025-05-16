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
 * Classe de entidade para clientes.
 * 
 * @author Kayke Ragoso
 */
@Entity
@Table(name="clientes")
public class clientes {
    // Identificador único do cliente (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    // Nome do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String nomeUsuario;

    // CPF do usuário (único, pode ser nulo)
    @Column(nullable = true, unique = true)
    private String cpf;

    // E-mail do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String emailUsuario;

    // Celular do usuário (não pode ser nulo e deve ser único)
    @Column(nullable = false, unique = true)
    private String celular;    

    // Observação sobre o usuário (não pode ser nulo)
    @Column(nullable = false)
    private String observaçãoUsuario;

    // Data de nascimento do usuário (não pode ser nulo)
    @Column(nullable = false) 
    private String nascimentoUsuario;

    // Data de entrada do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String entradaUsuario;

    // Função do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String cmbFunção;

    // Sexo do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String sexoUsuario;

    // Salário base do usuário (não pode ser nulo)
    @Column(nullable = false)
    private String salarioBase;
    
    // Construtor padrão
    public clientes() {
    }

    // Construtor com parâmetros
    public clientes(Integer codigo, String nomeUsuario, String cpfUsuario, String emailUsuario, String celularUsuario, String observaçãoUsuario, String nascimentoUsuario, String entradaUsuario, String cmbFunção, String sexoUsuario, String salarioBase) {
        this.codigo = codigo;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpfUsuario;
        this.emailUsuario = emailUsuario;
        this.celular = celularUsuario;
        this.observaçãoUsuario = observaçãoUsuario;
        this.nascimentoUsuario = nascimentoUsuario;
        this.entradaUsuario = entradaUsuario;
        this.cmbFunção = cmbFunção;
        this.sexoUsuario = sexoUsuario;
        this.salarioBase = salarioBase;
    }

    // Getters e setters para todos os campos
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpf;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpf = cpfUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCelularUsuario() {
        return celular;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celular = celularUsuario;
    }

    public String getObservaçãoUsuario() {
        return observaçãoUsuario;
    }

    public void setObservaçãoUsuario(String observaçãoUsuario) {
        this.observaçãoUsuario = observaçãoUsuario;
    }

    public String getNascimentoUsuario() {
        return nascimentoUsuario;
    }

    public void setNascimentoUsuario(String nascimentoUsuario) {
        this.nascimentoUsuario = nascimentoUsuario;
    }

    public String getEntradaUsuario() {
        return entradaUsuario;
    }

    public void setEntradaUsuario(String entradaUsuario) {
        this.entradaUsuario = entradaUsuario;
    }

    public String getCmbFunção() {
        return cmbFunção;
    }

    public void setCmbFunção(String cmbFunção) {
        this.cmbFunção = cmbFunção;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Representação em String do objeto clientes
    @Override
    public String toString() {
        return "clientes{" + "codigo=" + codigo + ", nomeUsuario=" + nomeUsuario + ", cpfUsuario=" + cpf + ", emailUsuario=" + emailUsuario + ", celularUsuario=" + celular + ", observa\u00e7\u00e3oUsuario=" + observaçãoUsuario + ", nascimentoUsuario=" + nascimentoUsuario + ", entradaUsuario=" + entradaUsuario + ", cmbFun\u00e7\u00e3o=" + cmbFunção + ", sexoUsuario=" + sexoUsuario + ", salarioBase=" + salarioBase + '}';
    }

}
