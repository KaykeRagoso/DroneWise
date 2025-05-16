/*
 * Classe DAO responsável pelas operações de acesso e manipulação de dados da entidade clientes.
 * Utiliza JPA para persistência, alteração, remoção, busca e autenticação de clientes no banco de dados.
 * Inclui métodos para autenticação, busca por telefone, busca por ID, busca de todos os clientes e criação de login.
 */
package br.estacio.projetoestacio.visao;

import br.estacio.projetoestacio.modelo.clientes;
import br.estacio.projetoestacio.testes.Interface.FrmTelaPrincipal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 * Classe DAO para operações com clientes.
 * 
 * @author Kayke Ragoso
 */
public class ClienteDAO {
    // Gerenciador de entidades JPA
    private final EntityManager EM;
    // Flag para autenticação
    public boolean autenticado = false;
    
    // Instância da tela principal (interface gráfica)
    FrmTelaPrincipal p = new FrmTelaPrincipal();
    
    // Construtor que recebe o EntityManager
    public ClienteDAO(EntityManager EM){
        this.EM = EM;
    }
    
    // Método para cadastrar um novo cliente
    public void cadastrar(clientes cliente){
        EM.persist(cliente);
    }
    
    // Método para alterar um cliente existente
    public void alterar(clientes cliente){
        EM.merge(cliente);
    }
    
    // Método para remover um cliente
    public void remover(clientes cliente){
        cliente = EM.merge(cliente);
        EM.remove(cliente);
    }
    
    // Busca um cliente pelo ID
    public clientes buscarPorId(Integer id){
        return EM.find(clientes.class, id);
    }
    
    // Busca todos os nomes de usuários cadastrados
    public List<String> buscarSetores(){
        TypedQuery<String> query = EM.createQuery("SELECT c.nomeUsuario FROM clientes c", String.class);
        return query.getResultList();
    }
    
    // Busca todos os clientes cadastrados
    public List<clientes> buscarTodos(){
        String jpql = "SELECT c FROM clientes c";
        return EM.createQuery(jpql,clientes.class).getResultList();
    }
    
    // Busca um cliente pelo telefone
    public clientes buscarPorTelefone(String tel){
        String jpql = "SELECT c FROM clientes c where c.telefone = :tel";
        return EM.createQuery(jpql,clientes.class)
                .setParameter("telefone", tel)
                .getSingleResult();
    }
    
    // Autentica um cliente pelo CPF e celular
    public boolean autenticar(String cpfusuario, String celularusuario){
        try {
                // Ajuste a JPQL para usar os nomes corretos dos atributos da entidade clientes
                String jpql = "SELECT c FROM clientes c WHERE c.cpf = :cpfusuario and c.celular = :celularusuario";
                TypedQuery<clientes> query = EM.createQuery(jpql, clientes.class);

                // Define os parâmetros da consulta
                query.setParameter("cpfusuario", cpfusuario);
                query.setParameter("celularusuario", celularusuario);

                // Executa a consulta
                clientes result = query.getSingleResult();

                // Login bem-sucedido
                System.out.println("Login realizado com sucesso.");
                //JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                p.setVisible(true);
                return true;
            } catch (NoResultException e) {
                // Mensagem para login inválido
                //JOptionPane.showMessageDialog(null, "CPF ou celular incorretos.");
                System.out.println("CPF ou celular incorretos.");
                return false;
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e.getMessage());
                System.out.println(e.getMessage());
                return false;
            }
    }

    // Cria um novo login para o cliente, controlando a transação manualmente
    public void CriarLogin(clientes cliente){
        EntityTransaction transaction = null;
                try {
                    transaction = EM.getTransaction();
                    transaction.begin();

                    EM.persist(cliente); // Insere o cliente no banco de dados

                    transaction.commit(); // Confirma a transação
                    System.out.println("Cliente inserido com sucesso.");

                } catch (Exception e) {
                    if (transaction != null && transaction.isActive()) {
                        transaction.rollback(); // Desfaz a transação em caso de erro
                    }
                    System.out.println("Erro ao tentar inserir Cliente: " + e.getMessage());
                }
    }
}