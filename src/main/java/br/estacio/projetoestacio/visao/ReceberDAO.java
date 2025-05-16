/*
 * Classe DAO responsável pelas operações de acesso e manipulação de dados da entidade receber.
 * Utiliza JPA para persistência de valores a receber no banco de dados.
 * Controla transações para garantir a integridade dos dados durante a inserção.
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.receber;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Classe DAO para operações com valores a receber.
 * 
 * @author Kayke Ragoso
 */
public class ReceberDAO {
    // Gerenciador de entidades JPA
    private final EntityManager EM;

    // Construtor que recebe o EntityManager
    public ReceberDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    // Método para cadastrar um novo recebimento
    public void Receber(receber recebimento){
        EntityTransaction transaction = null;
        try {
            transaction = EM.getTransaction();
            transaction.begin();

            EM.persist(recebimento); // Insere o recebimento no banco de dados

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
