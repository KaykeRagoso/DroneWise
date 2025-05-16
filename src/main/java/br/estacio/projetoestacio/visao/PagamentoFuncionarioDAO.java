/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.pagamentofuncionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author 16380127763
 */
public class PagamentoFuncionarioDAO {
    private final EntityManager EM;

    public PagamentoFuncionarioDAO(EntityManager EM) {
        this.EM = EM;
    }
    
    public void Pagamento(pagamentofuncionario pagamento){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(pagamento); // Insere o cliente no banco de dados

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
