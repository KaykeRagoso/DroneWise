/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.estacio.projetoestacio.testes;

import br.estacio.projetoestacio.conexao.ConexaoBD;
import br.estacio.projetoestacio.modelo.clientes;
import br.estacio.projetoestacio.visao.ClienteDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author 16380127763
 */
public class TesteBuscarPorID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = ConexaoBD.getEntityManager();
        
        em.getTransaction().begin();
        ClienteDAO dao = new ClienteDAO(em);
        clientes novo = dao.buscarPorId(8);
        em.getTransaction().commit();
        em.close();
        
        System.out.println(novo);
        
    }
    
}
