/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe responsável por gerenciar a conexão com o banco de dados utilizando JPA.
 * O EntityManagerFactory é criado uma única vez para a unidade de persistência "db_DroneWise".
 * O método getEntityManager() fornece instâncias de EntityManager para operações no banco.
 */
package br.estacio.projetoestacio.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe utilitária para fornecer EntityManager para acesso ao banco de dados.
 * 
 * @author Kayke Ragoso
 */
public class ConexaoBD {
    // Cria uma única instância de EntityManagerFactory para a aplicação
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("db_DroneWise");
    
    /**
     * Retorna uma nova instância de EntityManager para operações no banco de dados.
     * @return EntityManager
     */
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
