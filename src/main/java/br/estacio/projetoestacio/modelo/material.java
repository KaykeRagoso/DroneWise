/*
 * Classe de modelo que representa a entidade "material" no banco de dados.
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
 * Classe de entidade para materiais.
 * 
 * @author Kayke Ragoso
 */
@Entity
@Table(name="material")
public class material {
    // Identificador único do material (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    // Nome do produto (não pode ser nulo)
    @Column(nullable = false)
    private String Produto;

    // Quantidade do produto (não pode ser nulo)
    @Column(nullable = false)
    private String Quantidade;

    // Marca do produto (não pode ser nulo)
    @Column(nullable = false)
    private String Marca;

    // Preço de compra do produto (não pode ser nulo)
    @Column(nullable = false)
    private String PreçoCompra;  

    // Data da compra do produto (não pode ser nulo)
    @Column(nullable = false)
    private String DataCompra;      

    // Modelo do produto (não pode ser nulo)
    @Column(nullable = false)
    private String Modelo;

    // Nome do comprador (não pode ser nulo)
    @Column(nullable = false)
    private String Comprador;

    // Construtor padrão
    public material() {
    }

    // Construtor com parâmetros
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

    // Getters e setters para todos os campos
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

    // Representação em String do objeto material
    @Override
    public String toString() {
        return "material{" + "codigo=" + codigo + ", Produto=" + Produto + ", Quantidade=" + Quantidade + ", Marca=" + Marca + ", Pre\u00e7oCompra=" + PreçoCompra + ", DataCompra=" + DataCompra + ", Modelo=" + Modelo + ", Comprador=" + Comprador + '}';
    }
    
    
}
