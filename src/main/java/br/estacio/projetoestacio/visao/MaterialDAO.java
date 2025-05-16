/*
 * Classe DAO responsável pelas operações de acesso e manipulação de dados da entidade material.
 * Utiliza JPA para persistência de materiais comprados no banco de dados.
 * Controla transações para garantir a integridade dos dados durante a inserção.
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.material;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Classe DAO para operações com materiais.
 * 
 * @author Kayke Ragoso
 */
public class MaterialDAO {
    // Gerenciador de entidades JPA
    private final EntityManager EM;

    // Construtor que recebe o EntityManager
    public MaterialDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    // Método para cadastrar um novo material comprado
    public void Material(material MaterialComprado){
        EntityTransaction transaction = null;
        try {
            transaction = EM.getTransaction();
            transaction.begin();

            EM.persist(MaterialComprado); // Insere o material no banco de dados

            transaction.commit(); // Confirma a transação
            System.out.println("Material Comprado inserido com sucesso.");

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback(); // Desfaz a transação em caso de erro
            }
            System.out.println("Erro ao tentar inserir Material Comprado: " + e.getMessage());
        }
    }
}
