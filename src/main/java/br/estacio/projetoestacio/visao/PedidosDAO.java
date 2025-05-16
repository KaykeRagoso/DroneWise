/*
 * Classe DAO responsável pelas operações de acesso e manipulação de dados da entidade pedidos.
 * Utiliza JPA para persistência de pedidos no banco de dados.
 * Controla transações para garantir a integridade dos dados durante a inserção.
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.pedidos;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Classe DAO para operações com pedidos.
 * 
 * @author Kayke Ragoso
 */
public class PedidosDAO {
    // Gerenciador de entidades JPA
    private final EntityManager EM;

    // Construtor que recebe o EntityManager
    public PedidosDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    // Método para cadastrar um novo pedido
    public void criarPedidos(pedidos pedido){
        EntityTransaction transaction = null;
        try {
            transaction = EM.getTransaction();
            transaction.begin();

            EM.persist(pedido); // Insere o pedido no banco de dados

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
