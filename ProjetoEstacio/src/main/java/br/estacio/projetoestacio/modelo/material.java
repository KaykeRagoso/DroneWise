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
@Table(name="material")
public class material {
     //Wrappers --> Integer, Double, Float, Boolean, ...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(nullable = false)
    private String Produto;
    @Column(nullable = false)
    private String Quantidade;
    @Column(nullable = false)
    private String Marca;
    @Column(nullable = false)
    private String PreçoCompra;  
    @Column(nullable = false)
    private String DataCompra;      
    @Column(nullable = false)
    private String Modelo;
    @Column(nullable = false)
    private String Comprador;

    public material() {
    }

    public material(Integer codigo, String Produto, String Quantidade, String Marca, String PreçoCompra, String DataCompra, String Modelo, String Comprador) {
        this.codigo = codigo;
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.Marca = Marca;
        this.PreçoCompra = PreçoCompra;
        this.DataCompra = DataCompra;
        this.Modelo = Modelo;
        this.Comprador = Comprador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPreçoCompra() {
        return PreçoCompra;
    }

    public void setPreçoCompra(String PreçoCompra) {
        this.PreçoCompra = PreçoCompra;
    }

    public String getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(String DataCompra) {
        this.DataCompra = DataCompra;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getComprador() {
        return Comprador;
    }

    public void setComprador(String Comprador) {
        this.Comprador = Comprador;
    }

    @Override
    public String toString() {
        return "material{" + "codigo=" + codigo + ", Produto=" + Produto + ", Quantidade=" + Quantidade + ", Marca=" + Marca + ", Pre\u00e7oCompra=" + PreçoCompra + ", DataCompra=" + DataCompra + ", Modelo=" + Modelo + ", Comprador=" + Comprador + '}';
    }
    
    
}
