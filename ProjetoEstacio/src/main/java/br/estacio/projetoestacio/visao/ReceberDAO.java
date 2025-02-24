/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.receber;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author 16380127763
 */
public class ReceberDAO {
    private final EntityManager EM;

    public ReceberDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    public void Receber(receber recebimento){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(recebimento); // Insere o cliente no banco de dados

                    transaction.commit(); // Confirma a transação
                    System.out.println("Recebimento inserido com sucesso.");

                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback(); // Desfaz a transação em caso de erro
                    }
                    System.out.println("Erro ao tentar inserir Recebimento: " + e.getMessage());
                }
    }
}
