/*
 * Classe DAO responsável pelas operações de acesso e manipulação de dados da entidade pagamentofuncionario.
 * Utiliza JPA para persistência de pagamentos de funcionários no banco de dados.
 * Controla transações para garantir a integridade dos dados durante a inserção.
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.pagamentofuncionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Classe DAO para operações com pagamentos de funcionários.
 * 
 * @author Kayke Ragoso
 */
public class PagamentoFuncionarioDAO {
    // Gerenciador de entidades JPA
    private final EntityManager EM;

    // Construtor que recebe o EntityManager
    public PagamentoFuncionarioDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    // Método para cadastrar um novo pagamento de funcionário
    public void Pagamento(pagamentofuncionario pagamento){
        EntityTransaction transaction = null;
        try {
            transaction = EM.getTransaction();
            transaction.begin();

            EM.persist(pagamento); // Insere o pagamento no banco de dados

            transaction.commit(); // Confirma a transação
            System.out.println("Pagamento inserido com sucesso.");

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback(); // Desfaz a transação em caso de erro
            }
            System.out.println("Erro ao tentar inserir Pagamento: " + e.getMessage());
        }
    }
}
