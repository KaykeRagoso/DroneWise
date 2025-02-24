/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.pedidos;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author 16380127763
 */
public class PedidosDAO {
    private final EntityManager EM;

    public PedidosDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    public void criarPedidos(pedidos pedido){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(pedido); // Insere o cliente no banco de dados

                    transaction.commit(); // Confirma a transação
                    System.out.println("Pedido inserido com sucesso.");

                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback(); // Desfaz a transação em caso de erro
                    }
                    System.out.println("Erro ao tentar inserir Pedido: " + e.getMessage());
                }
    }
}
