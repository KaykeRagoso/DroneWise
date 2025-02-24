/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 16380127763
 */
public class ConexaoBD {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("db_Projeto");
    
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
